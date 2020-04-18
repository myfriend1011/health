package com.yanxu.controller;

import com.yanxu.domain.*;
import com.yanxu.service.IEig_code_groud_service;
import com.yanxu.uitls.JsonUtils;
import com.yanxu.uitls.Result;
import org.apache.ibatis.executor.ReuseExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/eight")
public class Eight_code_groud_controller {
    @Autowired
    private IEig_code_groud_service eig_code_groud_service;

    @RequestMapping("/findAll")
    private void eight_findAll(HttpServletRequest request,HttpServletResponse response){
        HttpSession session = request.getSession();
        String dt = (String) session.getAttribute("dt");
        List<Eig_code_groud> all = eig_code_groud_service.yuCeDataFun(dt);
        System.out.println("fdfiji+++++++++++++++++++++++="+dt);
        try {
            if(all != null && all.size() >0 ){
                JsonUtils.printResult(response,new Result(true,"eight查询数据信息成功",all));
            }else{
                JsonUtils.printResult(response,new Result(false,"eight查询数据信息失败"));
            }
        } catch (IOException e) {
            e.printStackTrace();
            try {
                JsonUtils.printResult(response,new Result(false,"eight查询数据失败了"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    @RequestMapping("/find_eightGuanLianThere")
    public String find_eightGuanLianThere(HttpServletResponse response,Integer id) throws IOException {
        try {
            List<Three_code_groud> threeCodeGrouds = eig_code_groud_service.find_eightGuanLianThere(id);
            JsonUtils.printResult(response,new Result(true,"eight关联there查询成功",threeCodeGrouds));
        } catch (IOException e) {
            e.printStackTrace();
            JsonUtils.printResult(response,new Result(false,"eight关联there查询失败"));
        }

        return "eight";
    }

    @RequestMapping("/find_eightGuanLianFour")
    public String find_eightGuanLianFour(HttpServletResponse response,Integer id) throws IOException {
        try {
            List<Four_code_groud> fourCodeGrouds =  eig_code_groud_service.find_eightGuanLianFour(id);
            JsonUtils.printResult(response,new Result(true,"eight关联four查询成功",fourCodeGrouds));
        } catch (IOException e) {
            e.printStackTrace();
            JsonUtils.printResult(response,new Result(false,"eight关联four查询失败"));
        }
        return "eight";
    }

    @RequestMapping("/find_eightGuanLianFive")
    public String find_eightGuanLianFive(HttpServletResponse response,Integer id) throws IOException {
        try {
            List<Five_code_groud> fiveCodeGrouds =  eig_code_groud_service.find_eightGuanLianFive(id);
            JsonUtils.printResult(response,new Result(true,"eight关联fivec查询成功",fiveCodeGrouds));
        } catch (IOException e) {
            e.printStackTrace();
            JsonUtils.printResult(response,new Result(false,"eight关联five查询失败"));
        }
        return "eight";
    }

    @RequestMapping("/find_eightGuanLianSix")
    public String find_eightGuanLianSix(HttpServletResponse response,Integer id) throws IOException {
        try {
            List<Six_code_groud> sixCodeGrouds =  eig_code_groud_service.find_eightGuanLianSix(id);
            JsonUtils.printResult(response,new Result(true,"eight关联six查询成功",sixCodeGrouds));
        } catch (IOException e) {
            e.printStackTrace();
            JsonUtils.printResult(response,new Result(false,"eight关联six查询失败"));
        }
        return "eight";
    }

    @RequestMapping("/find_eightGuanLianSeven")
    public String find_eightGuanLianSeven(HttpServletResponse response,Integer id) throws IOException {
        try {
            List<Sev_code_groud> sevCodeGrouds =  eig_code_groud_service.find_eightGuanLianSeven(id);
            JsonUtils.printResult(response,new Result(true,"eight关联seven查询成功",sevCodeGrouds));
        } catch (IOException e) {
            e.printStackTrace();
            JsonUtils.printResult(response,new Result(false,"eight关联seven查询失败"));
        }
        return "eight";
    }

}
