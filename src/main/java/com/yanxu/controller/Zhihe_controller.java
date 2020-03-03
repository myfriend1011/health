package com.yanxu.controller;

import com.yanxu.service.interfacees.IZhihe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Zhihe")
public class Zhihe_controller {
    @Autowired
    private IZhihe iZhihe;
    @RequestMapping("/insertZhihe")
    public ModelAndView insertZhihe(ModelAndView mv)
    {
        try {
            iZhihe.insertZhihe();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        mv.setViewName("soccess");
        return mv;
    }
}
