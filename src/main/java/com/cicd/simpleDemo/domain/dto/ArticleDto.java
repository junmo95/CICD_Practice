package com.cicd.simpleDemo.domain.dto;

import com.cicd.simpleDemo.domain.Article;

public record ArticleDto(
        Long id,
        String title,
        String content
) {


    public static ArticleDto fromEntity(Article entity) {
        return new ArticleDto(
                entity.getId(),
                entity.getTitle(),
                entity.getContent()
        );
    }

    public Article toEntity() {
        return Article.of(title, content);
    }



}
