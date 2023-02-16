package com.jw.webprototype.presentation;

import com.jw.webprototype.domain.Comment;

public interface CommentRepository {
    Long save(Comment comment);
}
