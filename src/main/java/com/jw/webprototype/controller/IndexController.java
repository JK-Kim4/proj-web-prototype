package com.jw.webprototype.controller;

import com.jw.webprototype.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/login")
    public String loginPage(Model model){
        model.addAttribute("members", Application.members);
        return "login";
    }

    @GetMapping(value = {"/", "/index"})
    public String indexPage(){
        return "index";

    }
}
