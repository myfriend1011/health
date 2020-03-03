package com.yanxu.controller;

import com.yanxu.domain.*;
import com.yanxu.service.ISev_code_groud_service;
import com.yanxu.uitls.JsonUtils;
import com.yanxu.uitls.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/seven")
public class Sev_code_groud_controller {

    @Autowired
    private ISev_code_groud_service iSev_code_groud_service;
    @RequestMapping("/findAll")
    private void seven_findAll(HttpServletResponse response){
        List<Sev_code_groud> adll = iSev_code_groud_service.findAdll();
        try {
            if(adll != null && adll.size() >0 ){
                JsonUtils.printResult(response,new Result(true,"seven查询数据信息成功",adll));
            }else{
                JsonUtils.printResult(response,new Result(false,"seven查询数据信息失败"));
            }
        } catch (IOException e) {
            e.printStackTrace();
            try {
                JsonUtils.printResult(response,new Result(true,"seven查询数据信息失败"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    @RequestMapping("/find_sevenGuanLianThere")
    public String find_sevenGuanLianThere(HttpServletResponse response,Integer id) throws IOException {
        try {
            List<Three_code_groud> threeCodeGrouds = iSev_code_groud_service.find_sevenGuanLianThere(id);
            JsonUtils.printResult(response,new Result(true,"seven关联there查询成功",threeCodeGrouds));
        } catch (IOException e) {
            e.printStackTrace();
            JsonUtils.printResult(response,new Result(false,"seven关联there查询失败"));
        }

        return "seven";
    }

    @RequestMapping("/find_sevenGuanLianFour")
    public String find_sevenGuanLianFour(HttpServletResponse response,Integer id) throws IOException {
        try {
            List<Four_code_groud> fourCodeGrouds =  iSev_code_groud_service.find_sevenGuanLianFour(id);
            JsonUtils.printResult(response,new Result(true,"eight关联four查询成功",fourCodeGrouds));
        } catch (IOException e) {
            e.printStackTrace();
            JsonUtils.printResult(response,new Result(false,"eight关联four查询失败"));
        }
        return "seven";
    }

    @RequestMapping("/find_sevenGuanLianFive")
    public String find_sevenGuanLianFive(HttpServletResponse response,Integer id) throws IOException {
        try {
            List<Five_code_groud> fiveCodeGrouds =  iSev_code_groud_service.find_sevenGuanLianFive(id);
            JsonUtils.printResult(response,new Result(true,"seven关联fivec查询成功",fiveCodeGrouds));
        } catch (IOException e) {
            e.printStackTrace();
            JsonUtils.printResult(response,new Result(false,"seven关联five查询失败"));
        }
        return "seven";
    }

    @RequestMapping("/find_sevenGuanLianSix")
    public String find_sevenGuanLianSix(HttpServletResponse response,Integer id) throws IOException {
        try {
            List<Six_code_groud> sixCodeGrouds =  iSev_code_groud_service.find_sevenGuanLianSix(id);
            JsonUtils.printResult(response,new Result(true,"seven关联six查询成功",sixCodeGrouds));
        } catch (IOException e) {
            e.printStackTrace();
            JsonUtils.printResult(response,new Result(false,"seven关联six查询失败"));
        }
        return "seven";
    }

    @RequestMapping("/find_sevenGuanLianEight")
    public String find_sevenGuanLianEight(HttpServletResponse response,Integer id) throws IOException {
        try {
            List<Eig_code_groud> eigCodeGrouds =  iSev_code_groud_service.find_sevenGuanLianEight(id);
            JsonUtils.printResult(response,new Result(true,"seven关联six查询成功",eigCodeGrouds));
        } catch (IOException e) {
            e.printStackTrace();
            JsonUtils.printResult(response,new Result(false,"seven关联six查询失败"));
        }
        return "seven";
    }
}
