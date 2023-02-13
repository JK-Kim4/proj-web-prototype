package com.jw.webprototype.domain;

/**
 * 사용자 domain
 * */
public class Member {

    private static int INDEX = 1;

    public Member(){};

    public Member(String name){
        this.id = INDEX++;
        this.name = name;
    }

    private int id;

    private String name;


}
