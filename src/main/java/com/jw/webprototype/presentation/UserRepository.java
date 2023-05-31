package com.jw.webprototype.presentation;

import com.jw.webprototype.controller.dto.UserDto;

public interface UserRepository {

    Long save(UserDto dto);
}
