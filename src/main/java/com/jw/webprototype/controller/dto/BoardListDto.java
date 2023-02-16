package com.jw.webprototype.controller.dto;

import com.jw.webprototype.domain.Board;
import com.jw.webprototype.domain.Member;

public class BoardListDto {

    private Board board;
    private Member author;

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setAuthor(Member author) {
        this.author = author;
    }

    public Board getBoard() {
        return board;
    }

    public Member getAuthor() {
        return author;
    }
}
