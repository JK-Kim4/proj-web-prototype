package com.jw.webprototype.controller.dto;

public class UserDto {

    public UserDto(){

    }

    public UserDto(String id, String password, String nickName){
        this.id = id;
        this.password = password;
        this.nickName = nickName;
    }

    private String id;
    private String password;
    private String nickName;

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
