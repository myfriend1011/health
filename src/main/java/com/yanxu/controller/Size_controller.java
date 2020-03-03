package com.yanxu.controller;

import com.yanxu.domain.pojo.Theres;
import com.yanxu.service.interfacees.ISize;
import com.yanxu.service.interfaceimp.ISizeImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/threecode")
public class Size_controller {
    @Autowired
    private ISize iSize;
    @RequestMapping("/updageDate")
    public void update(@RequestBody Theres theres){

    }
}
