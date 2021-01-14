package com.clownly.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author clownly
 * @create 2021-01-14 16:41
 */
@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {

    @GetMapping("/hello")
    public String hello(Model m){
        m.addAttribute("name","hello");
        return "hello";
    }


}
