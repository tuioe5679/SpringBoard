package com.board.boardProject.controller;

import com.board.boardProject.entity.Board;
import com.board.boardProject.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//JSON 반환 어노테이션
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/hello")
    public String Hello(){
        return "Hello";
    }

    @GetMapping("/board/write")
    public String boardWrite() {
        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(Board board){
        boardService.write(board);
        return "";
    }
}
