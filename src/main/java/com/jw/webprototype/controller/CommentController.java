package com.jw.webprototype.controller;

import com.jw.webprototype.controller.dto.CommentSaveDto;
import com.jw.webprototype.domain.Comment;
import com.jw.webprototype.service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/comment")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    @GetMapping("/{boardId}")
    @ResponseBody
    public List<Comment> getCommentListByBoardId(@PathVariable("boardId") Long boardId){
        return commentService.findCommentsByBoardId(boardId);
    }

    @PostMapping("/insert")
    @ResponseBody
    public Long save(@RequestBody CommentSaveDto dto){
        return commentService.save(dto);
    }
}
