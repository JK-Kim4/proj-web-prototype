package com.jw.webprototype.service;

import com.jw.webprototype.controller.dto.UserDto;
import com.jw.webprototype.domain.User;
import com.jw.webprototype.presentation.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Long save(UserDto dto){
        return userRepository.save(dto);
    }

    public User login(UserDto userDto) {

        User findUser = userRepository.findByUserId(userDto.getId());
        if(findUser.equals(userDto.getPassword())){
            return findUser;
        }else{
            return null;
        }
    }
}
