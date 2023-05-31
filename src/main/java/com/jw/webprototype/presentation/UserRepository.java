package com.jw.webprototype.presentation;

import com.jw.webprototype.controller.dto.UserDto;
import com.jw.webprototype.domain.User;

public interface UserRepository {

    Long save(UserDto dto);

    User findbyUserId(String id);
}
