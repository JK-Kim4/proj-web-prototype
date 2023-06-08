package com.jw.webprototype.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(value = {"/", "/index", "/menu/list"})
    public String menuListPage(){
        return "contents/menu-list";
    }

    /*@GetMapping(value = {"/", "/index", "/login"})
    public String loginPage(Model model){
        model.addAttribute("members", Application.members);
        return "login";
    }*/

    /*@PostMapping("/login")
    public String login(HttpSession session, String name){
        Member member = new Member(name);
        session.setAttribute("member", member);
        return "redirect:/board/list";
    }*/

    /*@GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login";
    }*/
}
