package com.zfc.ta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/page")
    public String page(){
        return "homePage";
    }



}
