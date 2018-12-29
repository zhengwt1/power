package com.uino.powermanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class adminController {

    @RequestMapping("/")
    public String index(){
        return "test.html";
    }

    @RequestMapping("lookCity")
    public String lookCity(String i){
     return "city"+i+".html";
    }

}
