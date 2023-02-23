package com.jw.webprototype.service;

import com.jw.webprototype.controller.dto.CommentSaveDto;
import com.jw.webprototype.domain.Comment;
import com.jw.webprototype.presentation.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }

    public List<Comment> findCommentsByBoardId(Long boardId) {
        return null;
    }

    public Comment save(CommentSaveDto dto) {
        Comment comment = new Comment(dto);
        commentRepository.save(comment);
        return comment;
    }
}
