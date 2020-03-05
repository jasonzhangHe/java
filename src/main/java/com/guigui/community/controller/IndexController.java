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
public class IndexController {

    /**
     * 显示主页
     * @return  String
     */
    @GetMapping("/")
    public String showindex(){return "login/index";}


}
