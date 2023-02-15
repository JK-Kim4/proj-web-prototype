package com.jw.webprototype.presentation;


import com.jw.webprototype.domain.Board;

import java.util.ArrayList;
import java.util.List;

public class MemoryBoardRepository implements BoardRepository {

    private List<Board> boardList = new ArrayList<>();

    @Override
    public Long save(Board board) {
        this.boardList.add(board);
        Board saved = boardList.get(boardList.size()-1);
        return saved.getId();
    }

    @Override
    public Board findById(Long id) {
        return this.boardList.stream()
                .filter(b -> b.getId().equals(id))
                .findAny()
                .orElseThrow(()-> new NullPointerException("게시물이 존재하지 않습니다."));
    }

    @Override
    public List<Board> findAll() {
        return this.boardList;
    }
}
