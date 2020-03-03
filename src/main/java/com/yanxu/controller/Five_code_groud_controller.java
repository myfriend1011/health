package com.yanxu.controller;

import com.yanxu.domain.*;
import com.yanxu.service.IFive_code_groud_service;
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
@RequestMapping("/five")
public class Five_code_groud_controller {

    @Autowired
    private IFive_code_groud_service iFive_code_groud_service;
    @RequestMapping("/findAll")
    private void five_findAll(HttpServletResponse response)  {
        List<Five_code_groud> Fcg = iFive_code_groud_service.findAll();
        try {
            if(Fcg.size() > 0 && Fcg != null){
                JsonUtils.printResult(response,new Result(true,"five查询所有数据成功",Fcg));
            }else{
                JsonUtils.printResult(response,new Result(false,"five查询所有数据失败"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                JsonUtils.printResult(response,new Result(false,"five查询所有数据失败"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    @RequestMapping("/find_fiveGuanLianThere")
    public String find_fiveGuanLianThere(HttpServletResponse response,Integer id) throws IOException {
        List<Three_code_groud> theress =  iFive_code_groud_service.find_fiveGuanLianThere(id);
        try {
                //向页面传入数据
                JsonUtils.printResult(response, new Result(true,"five关联there查询数据成功",theress));

        } catch (IOException e) {
            //打印异常
            e.printStackTrace();
            JsonUtils.printResult(response,new Result(false,"five关联there查询数据失败"));
        }
        //返回视图
        return "four";
    }

    @RequestMapping("/find_fiveGuanLianFour")
    public  String find_fourGuanLianFive(HttpServletResponse response,Integer id){
        try {
            List<Four_code_groud> fiveCodeGrouds =  iFive_code_groud_service.find_fiveGuanLianFour(id);
            JsonUtils.printResult(response,new Result(true,"five关联four查询成功",fiveCodeGrouds));
        } catch (Exception e) {
            e.printStackTrace();
            try {
                JsonUtils.printResult(response,new Result(false,"five关联four查询失败"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        return "four";
    }

    @SneakyThrows
    @RequestMapping("/find_fiveGuanLianSix")
    public String find_fiveGuanLianSix(HttpServletResponse response, Integer id){
        try {
            List<Six_code_groud> sixCodeGrouds = iFive_code_groud_service.find_fiveGuanLianSix(id);
            JsonUtils.printResult(response,new Result(true,"five关联six查询成功",sixCodeGrouds));
        } catch (IOException e) {
            e.printStackTrace();
            JsonUtils.printResult(response,new Result(false,"five关联six查询失败"));
        }
        return "four";
    }

    @RequestMapping("/find_fiveGuanLianSeven")
    public String find_fiveGuanLianSeven(HttpServletResponse response, Integer id) throws IOException {
        try {
            List<Sev_code_groud> sevCodeGrouds = iFive_code_groud_service.find_fiveGuanLianSeven(id);
            JsonUtils.printResult(response,new Result(true,"five关联seven查询成功",sevCodeGrouds));
        } catch (IOException e) {
            e.printStackTrace();
            JsonUtils.printResult(response,new Result(false,"five关联seven查询失败"));
        }
        return "four";
    }
    @RequestMapping("/find_fiveGuanLianEight")
    public String find_fiveGuanLianEight(HttpServletResponse response, Integer id) throws IOException {
        try {
            List<Eig_code_groud> eigCodeGrouds = iFive_code_groud_service.find_fiveGuanLianEight(id);
            JsonUtils.printResult(response,new Result(true,"five关联eight查询成功",eigCodeGrouds));
        } catch (IOException e) {
            e.printStackTrace();
            JsonUtils.printResult(response,new Result(false,"five关联eight查询失败"));
        }
        return "four";
    }

}
