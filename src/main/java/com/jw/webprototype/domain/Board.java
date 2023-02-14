package com.jw.webprototype.domain;

/**
 * 게시판 domain
 * */
public class Board {

    private static Long index = 1L;

    public Board(){};

    public Board(Long authorId, String title, String desc){
        this.id = index++;
        this.authorId = authorId;
        this.title = title;
        this.desc = desc;
    }

    private Long id;

    private Long authorId;

    private String title;

    private String desc;


    public void setId(Long id) {
        this.id = id;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }
}
