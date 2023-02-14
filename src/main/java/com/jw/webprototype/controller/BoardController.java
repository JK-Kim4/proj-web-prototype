package com.jw.webprototype.controller;

import ch.qos.logback.core.model.Model;
import com.jw.webprototype.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;
    public BoardController(BoardService boardService){
        this.boardService = boardService;
    }
    @GetMapping("/list")
    public String listPage(Model model){

        return "contents/board/list";
    }
}
