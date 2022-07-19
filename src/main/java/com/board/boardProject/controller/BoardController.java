package com.board.boardProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//REST API Controller를 사용할것을 프레임워크에 알려줌
@Controller
public class BoardController {

    //HTTP GET 방식으로 문자열값을 매핑 (http://localhost:8080/Hello URL에 접속하면 메소드가 호출된다)
    @GetMapping("/Hello")
    //HTTP 요청에 Body로 변환하여 전달
    @ResponseBody
    public String main(){
        return "Hello";
    }

}
