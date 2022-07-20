package com.board.boardProject.repositroy;

import com.board.boardProject.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepositroy extends JpaRepository<Board,Integer> {
}
