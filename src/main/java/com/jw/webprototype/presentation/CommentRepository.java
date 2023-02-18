package com.jw.webprototype.presentation;

import com.jw.webprototype.domain.Comment;

import java.util.List;

public interface CommentRepository {
    Long save(Comment comment);

    List<Comment> findCommentsByBoardId(Long boardId);
}
