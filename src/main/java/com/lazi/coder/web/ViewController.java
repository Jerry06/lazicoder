package com.lazi.coder.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping({"/admin/**", "/about", "/blog/**"})
    public String index() {
        return "forward:/index.html";
    }

}