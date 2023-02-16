package com.jw.webprototype.domain;

import com.jw.webprototype.controller.dto.CommentSaveDto;

import java.time.LocalDate;

/**
 * 댓글 domain
 * */
public class Comment {

    private Long index = 1L;

    public Comment(CommentSaveDto dto){
        if(dto.getUpperCommentId() == 0){
            this.upperCommentId = index;
        }else{
            this.upperCommentId = dto.getUpperCommentId();
        }
        this.id = index++;
        this.authorId = dto.getAuthorId();
        this.boardId = dto.getBoardId();
        this.depth = dto.getDepth();
        this.desc = dto.getDesc();
        this.createdDate = LocalDate.now();
    }

    private Long id;
    private String authorId;
    private Long boardId;
    private Long upperCommentId;
    private int depth;
    private String desc;

    private LocalDate createdDate;

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    public void setUpperCommentId(Long upperCommentId) {
        this.upperCommentId = upperCommentId;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public Long getBoardId() {
        return boardId;
    }

    public Long getUpperCommentId() {
        return upperCommentId;
    }

    public int getDepth() {
        return depth;
    }

    public String getDesc() {
        return desc;
    }
}
