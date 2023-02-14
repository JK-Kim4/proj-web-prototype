package com.jw.webprototype.presentation;


import com.jw.webprototype.domain.Board;

import java.util.ArrayList;
import java.util.List;

public class MemoryBoardRepository implements BoardRepository {

    private static List<Board> boardList = new ArrayList<>();

    @Override
    public Long save(Board board) {
        boardList.add(board);
        Board saved = boardList.get(boardList.size()-1);
        return saved.getId();
    }

    @Override
    public Board findById(Long id) {
        return boardList.stream().filter(b -> b.getId().equals(id)).findAny().get();
    }

    @Override
    public List<Board> findAll() {
        return boardList;
    }
}
