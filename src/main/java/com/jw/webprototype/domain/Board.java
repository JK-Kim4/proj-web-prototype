package com.jw.webprototype.domain;

import com.jw.webprototype.controller.dto.BoardSaveDto;

import java.time.LocalDate;

/**
 * 게시판 domain
 * */
public class Board {

    private static Long index = 1L;

    public Board(){};


    public Board(BoardSaveDto dto){
        this.id = index++;
        this.authorId = dto.getAuthorId();
        this.title = dto.getTitle();
        this.desc = dto.getDesc();
        this.createdDate = LocalDate.now();
        this.viewCnt = 0;
    }

    private Long id;

    private Long authorId;

    private String title;

    private String desc;

    private LocalDate createdDate;

    private int viewCnt;


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

    public static void setIndex(Long index) {
        Board.index = index;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }

    public static Long getIndex() {
        return index;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public int getViewCnt() {
        return viewCnt;
    }
}
