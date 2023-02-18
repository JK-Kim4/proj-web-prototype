package com.jw.webprototype.domain;

/**
 * 사용자 domain
 * */
public class Member {

    private static Long index = 1L;

    public Member(){};

    public Member(String name){
        this.id = index++;
        this.name = name;
    }

    private Long id;

    private String name;

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
