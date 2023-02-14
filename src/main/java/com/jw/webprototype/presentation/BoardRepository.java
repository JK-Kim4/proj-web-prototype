package com.jw.webprototype.presentation;

import com.jw.webprototype.domain.Board;

import java.util.List;

public interface BoardRepository {

    Long save(Board board);

    List<Board> findAll();

    Board findById(Long id);

}
