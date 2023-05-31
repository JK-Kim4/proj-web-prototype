package com.jw.webprototype.domain;

import com.jw.webprototype.Application;
import com.jw.webprototype.controller.dto.UserDto;

public class User {

    public User(){}

    public User(UserDto dto){
        this.seq = Application.userIdSeq++;
        this.id = dto.getId();
        this.password = dto.getPassword();
        this.nickName = dto.getNickName();
    }

    private Long seq;
    private String id;
    private String password;
    private String nickName;

    public Long getSeq() {
        return seq;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
