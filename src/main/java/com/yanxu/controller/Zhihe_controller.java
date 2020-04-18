package com.yanxu.controller;

import com.yanxu.service.interfacees.IZhihe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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

    /*public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(6666);

        byte[] bytes = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        datagramSocket.receive(dp);

        int len = dp.getLength();

        System.out.println(new String(bytes,0,len));

        String hostAddress = dp.getAddress().getHostAddress();
        int port = dp.getPort();
        System.out.println("sendip:"+hostAddress);
        System.out.println("sendport"+port);

    }*/
}
