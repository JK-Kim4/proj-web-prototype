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

    public static Long getIndex() {
        return index;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void setIndex(Long index) {
        Member.index = index;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
