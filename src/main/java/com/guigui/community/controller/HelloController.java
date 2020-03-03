package com.guigui.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author huguolu
 * @create 2020-03-03-17:48
 */
@Controller
public class HelloController {


    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name , Model model){
        model.addAttribute("name", name);
        return  "hello";
    }


}
