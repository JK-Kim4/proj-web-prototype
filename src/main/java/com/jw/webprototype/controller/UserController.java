package com.jw.webprototype.controller;

import com.jw.webprototype.controller.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    /*회원 가입 로직*/
    @PostMapping("/signup")
    public String signupMethod(UserDto userDto){

        logger.debug(userDto.getId());
        logger.debug(userDto.getPassword());
        logger.debug(userDto.getNickName());

        System.out.println(userDto.getId());


        return "redirect:/login";
    }
}
