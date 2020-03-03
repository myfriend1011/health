package com.yanxu.controller;

import com.yanxu.dao.IFour_code_groud;
import com.yanxu.domain.*;
import com.yanxu.domain.pojo.Theres;
import com.yanxu.service.IFive_code_groud_service;
import com.yanxu.service.IFour_code_groud_service;
import com.yanxu.uitls.JsonUtils;
import com.yanxu.uitls.Result;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/four")
public class Four_code_groud_controller {

    @Autowired
    private IFour_code_groud_service iFour_code_groud_service;

    /**
     * 查询所有数据
     * @return
     */
    @RequestMapping("/findAll")
    public String four_findAll(HttpServletResponse response){
        //调用业务
        List<Four_code_groud> Fcg = iFour_code_groud_service.findAll();
        try {
            //判断数据
            if(Fcg != null && Fcg.size() > 0){
                //向页面传入数据
                JsonUtils.printResult(response, new Result(true,"four查询数据成功",Fcg));
            }else{
                JsonUtils.printResult(response,new Result(false,"four查询数据失败"));
            }
        } catch (IOException e) {
            //打印异常
            e.printStackTrace();
        }
        //返回视图
        return "pagemain";
    }

    @RequestMapping("/find_fourGuanLianThere")
    public String find_fourGuanLianThere(HttpServletResponse response,Integer id){
        List<Three_code_groud> theres =  iFour_code_groud_service.find_fourGuanLianThere(id);
        try {
            //判断数据
            if(theres != null && theres.size() > 0){
                //向页面传入数据
                JsonUtils.printResult(response, new Result(true,"four关联there查询数据成功",theres));
            }else{
                JsonUtils.printResult(response,new Result(false,"four关联there查询数据失败"));
            }
        } catch (IOException e) {
            //打印异常
            e.printStackTrace();
        }
        //返回视图
        return "four";
    }

    @RequestMapping("/find_fourGuanLianFive")
    public  String find_fourGuanLianFive(HttpServletResponse response,Integer id){
        try {
            List<Five_code_groud> fiveCodeGrouds =  iFour_code_groud_service.find_fourGuanLianFive(id);
            JsonUtils.printResult(response,new Result(true,"four关联five查询成功",fiveCodeGrouds));
        } catch (Exception e) {
            e.printStackTrace();
            try {
                JsonUtils.printResult(response,new Result(false,"four关联five查询失败"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        return "four";
    }

    @SneakyThrows
    @RequestMapping("/find_fourGuanLianSix")
    public String find_fourGuanLianSix(HttpServletResponse response, Integer id){
        try {
            List<Six_code_groud> sixCodeGrouds = iFour_code_groud_service.find_fourGuanLianSix(id);
            JsonUtils.printResult(response,new Result(true,"four关联six查询成功",sixCodeGrouds));
        } catch (IOException e) {
            e.printStackTrace();
            JsonUtils.printResult(response,new Result(false,"four关联six查询失败"));
        }
        return "four";
    }

    @RequestMapping("/find_fourGuanLianSeven")
    public String find_fourGuanLianSeven(HttpServletResponse response, Integer id) throws IOException {
        try {
            List<Sev_code_groud> sevCodeGrouds = iFour_code_groud_service.find_fourGuanLianSeven(id);
            JsonUtils.printResult(response,new Result(true,"four关联seven查询成功",sevCodeGrouds));
        } catch (IOException e) {
            e.printStackTrace();
            JsonUtils.printResult(response,new Result(false,"four关联seven查询失败"));
        }
        return "four";
    }
    @RequestMapping("/find_fourGuanLianEight")
    public String find_fourGuanLianEight(HttpServletResponse response, Integer id) throws IOException {
        try {
            List<Eig_code_groud> eigCodeGrouds = iFour_code_groud_service.find_fourGuanLianEight(id);
            JsonUtils.printResult(response,new Result(true,"four关联eight查询成功",eigCodeGrouds));
        } catch (IOException e) {
            e.printStackTrace();
            JsonUtils.printResult(response,new Result(false,"four关联eight查询失败"));
        }
        return "four";
    }
}
