package com.jw.webprototype.presentation;

import com.jw.webprototype.controller.dto.UserDto;
import com.jw.webprototype.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MemoryUserRepository implements UserRepository{

    private List<User> userList = new ArrayList<>();

    @Override
    public Long save(UserDto dto) {

        User user = new User(dto);
        userList.add(user);

        return user.getSeq();
    }

    @Override
    public User findbyUserId(String id) {
        return userList.stream().filter(u -> u.equals(id)).findAny().get();
    }
}
