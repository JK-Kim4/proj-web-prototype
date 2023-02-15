package com.jw.webprototype.controller.dto;

public class BoardSaveDto {

    private Long authorId;

    private String title;

    private String desc;

    public Long getAuthorId() {
        return authorId;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
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
}
