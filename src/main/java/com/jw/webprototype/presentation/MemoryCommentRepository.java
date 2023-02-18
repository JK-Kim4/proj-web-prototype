package com.jw.webprototype.presentation;


import com.jw.webprototype.domain.Comment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MemoryCommentRepository implements CommentRepository{


    private List<Comment> commentList = new ArrayList<>();

    @Override
    public Long save(Comment comment) {
        this.commentList.add(comment);
        Comment saved = commentList.get(commentList.size() -1);
        return saved.getId();
    }

    @Override
    public List<Comment> findCommentsByBoardId(Long boardId) {

        List<Comment> result =commentList.stream()
                .filter(comment -> comment.getBoardId().equals(boardId))
                .collect(Collectors.toList());

        return result;
    }
}
