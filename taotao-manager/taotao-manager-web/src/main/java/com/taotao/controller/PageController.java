package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2017-03-01.
 */

@Controller
public class PageController {
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }
}
