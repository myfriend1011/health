package com.yanxu.controller;

import com.yanxu.dao.IThree_code_groud;
import com.yanxu.domain.Eig_code_groud;
import com.yanxu.domain.Three_code_groud;
import com.yanxu.domain.pojo.Theres;
import com.yanxu.service.*;
import com.yanxu.service.interfacees.ISumAndKDuAndChazi;
import com.yanxu.uitls.JsonUtils;
import com.yanxu.uitls.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/UpdateAndAdd")
public class DateUpdateAndInsertController {


    @Autowired
    private IFour_code_groud_service iFour_code_groud_service;
    @Autowired
    private IFive_code_groud_service iFive_code_groud_service;
    @Autowired
    private ISix_code_groud_service iSix_code_groud_service;
    @Autowired
    private ISev_code_groud_service iSev_code_groud_service;
    @Autowired
    private IEig_code_groud_service iEig_code_groud_service;
    @Autowired
    private IThree_code_groud_service iThree_code_groud_service;

    @Autowired
    private ISumAndKDuAndChazi iSumAndKDuAndChazi;

    @RequestMapping("/update")
    public void update(HttpServletRequest request,HttpServletResponse response){
        try {
            Theres theres = JsonUtils.parseJSON2Object(request, Theres.class);
            //更新当前信息
           iFour_code_groud_service.update(theres.getName_one(),theres.getName_two(),theres.getName_the());
            iFive_code_groud_service.update(theres.getName_one(),theres.getName_two(),theres.getName_the());
            iSix_code_groud_service.update(theres.getName_one(),theres.getName_two(),theres.getName_the());
            iSev_code_groud_service.update(theres.getName_one(),theres.getName_two(),theres.getName_the());
            iEig_code_groud_service.update(theres.getName_one(),theres.getName_two(),theres.getName_the());
            iThree_code_groud_service.update(theres.getName_one(),theres.getName_two(),theres.getName_the());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            JsonUtils.printResult(response,new Result(true,"Updata数据成功"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 填充数据信息
     */
    @RequestMapping("/InsertDate")
    public void add(HttpServletResponse response) throws IOException {

        iFour_code_groud_service.add();
        iFive_code_groud_service.add();
        iSix_code_groud_service.add();
        iSev_code_groud_service.add();
        iEig_code_groud_service.add();

        System.out.println("添加数据信息");
        response.sendRedirect("/index");
    }

    @RequestMapping("/associationTable")
    public ModelAndView associationTable(){

        //there_code关联four_code
        iThree_code_groud_service.associationTable();
        ModelAndView fis = new ModelAndView();
        fis.setViewName("/index");
        return fis;
    }

    /**
     * 添加there与其他数据类型填充
     * @return
     */
    @RequestMapping("/updateTypeBy")
    public ModelAndView updateTypeBy(){
        iThree_code_groud_service.UpdateSizeById();
        iThree_code_groud_service.updateHeZhiById();
        iThree_code_groud_service.updateJiOuById();
        ModelAndView fis = new ModelAndView();
        fis.setViewName("there");
        return fis;
    }


    @Nullable
    @RequestMapping("/sumkuandu")
    public void save(){
        //iSumAndKDuAndChazi.save();
        //iThree_code_groud_service.updatechaziAndthere();
        //iThree_code_groud_service.updateSumAndthere();
        //iFive_code_groud_service.addFiveAndfour();
        /*iSix_code_groud_service.addSixAndfour();
        iSix_code_groud_service.addSixAndFive();
        iSev_code_groud_service.addSevenAndfour();
        iSev_code_groud_service.addSevenAndfive();
        iSev_code_groud_service.addSevenAndsixe();*/
        iEig_code_groud_service.addEightAndfour();
        /*iEig_code_groud_service.addEightAndfive();
        iEig_code_groud_service.addEightAndsixe();
        iEig_code_groud_service.addEightAndseven();*/
    }


    //杀号
    @RequestMapping("/yuCeDataFun")
    public String yuCeDataFun(HttpServletRequest request, HttpServletResponse response,@RequestParam("radio4") String radio4){
        List<Eig_code_groud> tcg =  iEig_code_groud_service.yuCeDataFun(radio4);
        HttpSession session = request.getSession();
        session.setAttribute("dt",radio4);
        try {
            if(tcg != null && tcg.size() > 0 ){
                JsonUtils.printResult(response,new Result(true,"yudata查询数据成功",tcg));
            }else{
                JsonUtils.printResult(response,new Result(false,"yudata查询失败"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "pagemain";
    }


}
