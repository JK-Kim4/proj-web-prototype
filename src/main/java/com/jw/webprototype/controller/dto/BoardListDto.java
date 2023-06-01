package com.jw.webprototype.controller.dto;

import com.jw.webprototype.domain.Board;
import com.jw.webprototype.domain.User;

public class BoardListDto {

    private Board board;
    private User author;

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Board getBoard() {
        return board;
    }

    public User getAuthor() {
        return author;
    }
}
