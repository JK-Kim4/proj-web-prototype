package com.jw.webprototype.controller;


import com.jw.webprototype.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
        model.addAttribute("boards", boardService.findAll());
        return "contents/board/list";
    }

    @GetMapping("/insert")
    public String insertPage(){
        return "contents/board/insert";
    }
}
