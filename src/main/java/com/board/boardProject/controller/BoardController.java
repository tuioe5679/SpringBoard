package com.board.boardProject.controller;

import com.board.boardProject.entity.Board;
import com.board.boardProject.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller//JSON 반환 어노테이션
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

    @GetMapping("/board/list")
    public String boardList(Model model){ //Model 데이터를 담아서 보냄
        model.addAttribute("list",boardService.boardList());//"list"에 모든 정보를 저장
        return "boardlist";
    }

    @GetMapping("/board/view")
    public String boardView(Model model,Integer id){
        model.addAttribute("board",boardService.boardView(id));
        return "boardview";
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(Board board){
        boardService.boardwrite(board);
        return "";
    }

}
