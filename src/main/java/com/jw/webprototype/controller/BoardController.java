package com.jw.webprototype.controller;


import com.jw.webprototype.controller.dto.BoardSaveDto;
import com.jw.webprototype.service.BoardService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/insert")
    @ResponseBody
    public Long insertMethod(HttpSession session,
                             @RequestBody BoardSaveDto dto){
        return boardService.save(dto, session);
    }
    @GetMapping("/{boardId}")
    public String detailPage(@PathVariable("boardId") Long boardId, Model model){
        model.addAttribute("board", boardService.findBoardById(boardId));
        return "contents/board/detail";
    }
}
