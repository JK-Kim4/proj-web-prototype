package com.jw.webprototype.controller.dto;

public class CommentSaveDto {

    private String authorId;
    private Long boardId;
    private Long upperCommentId;
    private int depth;
    private String desc;

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
