package com.jw.webprototype.controller.dto;

import com.jw.webprototype.domain.Board;
import com.jw.webprototype.domain.Comment;

import java.util.ArrayList;
import java.util.List;

public class BoardDetailDto {

    private Board board;

    private List<Comment> commentList = new ArrayList<>();

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public Board getBoard() {
        return board;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }
}
