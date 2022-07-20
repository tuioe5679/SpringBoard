package com.board.boardProject.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//DB 테이블
@Data
public class Board {

    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)// IDENTITY 자동 값 증가
    private Integer id;
    private String title;
    private String content;
}