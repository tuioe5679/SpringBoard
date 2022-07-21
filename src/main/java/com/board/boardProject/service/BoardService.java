package com.board.boardProject.service;

import com.board.boardProject.entity.Board;
import com.board.boardProject.repositroy.BoardRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepositroy boardRepositroy;

    public void boardwrite(Board board){
        boardRepositroy.save(board);
    }

    public List<Board> boardList(){
        return boardRepositroy.findAll();
    }

    public Board boardView(Integer id){
        return boardRepositroy.findById(id).get();
    }

}
