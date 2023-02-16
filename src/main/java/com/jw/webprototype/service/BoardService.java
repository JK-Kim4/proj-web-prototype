package com.jw.webprototype.service;

import com.jw.webprototype.controller.dto.BoardSaveDto;
import com.jw.webprototype.domain.Board;
import com.jw.webprototype.domain.Member;
import com.jw.webprototype.presentation.BoardRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository){
        this.boardRepository = boardRepository;
    }

    public List<Board> findAll() {
        return boardRepository.findAll();
    }

    public Long save(BoardSaveDto dto, HttpSession session) {
        Board board = new Board(dto);
        Member member = (Member) session.getAttribute("member");
        board.setAuthorId(member.getId());
        return boardRepository.save(board);
    }

    public Object findBoardById(Long boardId) {
        return boardRepository.findById(boardId);
    }
}
