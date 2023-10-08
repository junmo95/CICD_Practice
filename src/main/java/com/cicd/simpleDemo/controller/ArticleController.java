package com.cicd.simpleDemo.controller;

import com.cicd.simpleDemo.domain.dto.ArticleDto;
import com.cicd.simpleDemo.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/article")
@RestController
public class ArticleController {

    private final ArticleService articleService;


    @GetMapping("/hello")
    public String readHello() {
        String hello = "Hello World";
        return hello;
    }

    @PostMapping
    public ArticleDto createArticle(@RequestBody ArticleDto request) {
        ArticleDto articleDto = articleService.create(request);
        return articleDto;
    }

    @GetMapping("/{articleId}")
    public ArticleDto readArticle(@PathVariable Long articleId) {
        return articleService.get(articleId);
    }



}
