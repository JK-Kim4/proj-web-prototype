package com.jw.webprototype.controller;

import com.jw.webprototype.controller.dto.UserDto;
import com.jw.webprototype.domain.User;
import com.jw.webprototype.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    /*회원가입 페이지*/
    @GetMapping("/signup")
    public String signupPage(){
        return "signup";
    }

    @GetMapping("/signin")
    public String signinPage(){
        return "signin";
    }

    /*로그인 로직*/
    @PostMapping("/signin")
    public String signinMethod(UserDto userDto){

        User user = userService.login(userDto);

        return "redirect:/board/list";
    }

    /*회원 가입 로직*/
    @PostMapping("/signup")
    public String signupMethod(UserDto userDto){

        if(userDto != null){
            userService.save(userDto);
        }

        return "redirect:/user/signin";
    }
}
