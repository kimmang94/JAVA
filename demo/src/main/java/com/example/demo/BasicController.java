package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @GetMapping("/") // 메인페이지로 접속하면

    String hello(){
        return "index.html";
    }

    @GetMapping("/URL") // URL로 접속하면
    @ResponseBody
    String helloUrl(){
        return "<h4>URL 입니다</h4>";
    }

    @GetMapping("/about") // about로 접속하면
    @ResponseBody
    String helloAbout(){
        return "안녕하세요 about 페이지입니다";
    }
}
