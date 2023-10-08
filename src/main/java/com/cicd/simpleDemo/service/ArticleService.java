package com.cicd.simpleDemo.service;

import com.cicd.simpleDemo.domain.dto.ArticleDto;

public interface ArticleService {

    ArticleDto create(ArticleDto articleDto);
    ArticleDto get(Long articleId);
    ArticleDto update(ArticleDto articleDto);
    void delete(Long articleId);




}
