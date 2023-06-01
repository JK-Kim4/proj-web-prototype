package com.jw.webprototype.service;

import com.jw.webprototype.controller.dto.BoardDetailDto;
import com.jw.webprototype.controller.dto.BoardSaveDto;
import com.jw.webprototype.domain.Board;
import com.jw.webprototype.domain.User;
import com.jw.webprototype.presentation.BoardRepository;
import com.jw.webprototype.presentation.CommentRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardRepository boardRepository;
    private final CommentRepository commentRepository;

    public BoardService(BoardRepository boardRepository,
                        CommentRepository commentRepository){
        this.boardRepository = boardRepository;
        this.commentRepository = commentRepository;
    }

    public List<Board> findAll() {
        return boardRepository.findAll();
    }

    public Long save(BoardSaveDto dto, HttpSession session) {
        Board board = new Board(dto);

        User user = (User) session.getAttribute("user");
        if(user != null){
            board.setAuthorId(user.getSeq());
        }

        return boardRepository.save(board);
    }

    public BoardDetailDto findBoardById(Long boardId) {
        BoardDetailDto result = new BoardDetailDto();
        result.setBoard(boardRepository.findById(boardId));
        result.setCommentList(commentRepository.findCommentsByBoardId(boardId));

        return result;
    }
}
