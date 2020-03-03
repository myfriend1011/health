package com.yanxu.controller;

import com.yanxu.domain.Six_code_groud;
import com.yanxu.service.ISix_code_groud_service;
import com.yanxu.uitls.JsonUtils;
import com.yanxu.uitls.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/six")
public class Six_code_controller {

    @Autowired
    private ISix_code_groud_service iSix_code_groud_service;
    @RequestMapping("/findAll")
    public void six_findAll(HttpServletResponse response){
        try {
            List<Six_code_groud> all = iSix_code_groud_service.findAll();
            if(all != null && all.size() >0 ){
                JsonUtils.printResult(response,new Result(true,"six查询所有数据信息",all));
            }else{
                JsonUtils.printResult(response,new Result(false,"six查询所有数据信息"));
            }
        } catch (IOException e) {
            e.printStackTrace();
            try {
                JsonUtils.printResult(response,new Result(false,"six查询所有数据信息"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
