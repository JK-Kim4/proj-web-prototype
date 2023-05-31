package com.jw.webprototype.presentation;

import com.jw.webprototype.controller.dto.UserDto;
import com.jw.webprototype.domain.User;

import java.util.ArrayList;
import java.util.List;

public class MemoryUserRepository implements UserRepository{

    private List<User> userList = new ArrayList<>();

    @Override
    public Long save(UserDto dto) {

        User user = new User(dto);
        userList.add(user);

        return user.getSeq();
    }
}
