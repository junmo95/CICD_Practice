package com.cicd.simpleDemo.controller;

import com.cicd.simpleDemo.domain.dto.HelloDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/article")
@RestController
public class ArticleController {

    @GetMapping("/hello")
    public HelloDTO readHello() {
        String hello = "Hello World";
        return HelloDTO.of(hello);
    }

}
