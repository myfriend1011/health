package com.yanxu.controller;

import com.yanxu.domain.Three_code_groud;
import com.yanxu.service.IThree_code_groud_service;
import com.yanxu.uitls.JsonUtils;
import com.yanxu.uitls.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/there")
public class Three_code_groud_controller {
    @Autowired
    private IThree_code_groud_service iThree_code_groud_service;


    @RequestMapping("/findAll")
    public String thereFindAll(HttpServletResponse response){
        List<Three_code_groud> tcg = iThree_code_groud_service.findAll();
        try {
        if(tcg != null && tcg.size() > 0 ){
            JsonUtils.printResult(response,new Result(true,"there查询数据成功",tcg));
        }else{
            JsonUtils.printResult(response,new Result(false,"there查询失败"));
        }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "pagemain";
    }

    @RequestMapping("/yuCeDataFun")
    public String yuCeDataFun(HttpServletRequest request,HttpServletResponse response, @RequestParam("radio4") String radio4 ){
       List<Three_code_groud> tcg =  iThree_code_groud_service.yuCeDataFun(radio4);


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
