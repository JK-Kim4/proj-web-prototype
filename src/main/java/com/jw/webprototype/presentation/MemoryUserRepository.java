package com.jw.webprototype.presentation;

import com.jw.webprototype.controller.dto.UserDto;
import com.jw.webprototype.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class MemoryUserRepository implements UserRepository{

    private final Logger logger = LoggerFactory.getLogger(MemoryUserRepository.class);

    private static List<User> userList = new ArrayList<>();

    @Override
    public Long save(UserDto dto) {

        User user = new User(dto);
        userList.add(user);

        logger.debug("save user result 1 = {}", userList.size());
        logger.debug("save user result 2 = {}", user.getSeq());


        return user.getSeq();
    }

    @Override
    public User findbyUserId(String id) {
        return userList.stream().filter(u -> u.getId().equals(id)).findAny().get();
    }
}
