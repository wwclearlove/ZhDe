package com.zd.web.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController{
    @RequestMapping("/index")
    public String index(){
       return "technology_center/anlie";
    }
}
