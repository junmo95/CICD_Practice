package com.cicd.simpleDemo.service;


import com.cicd.simpleDemo.domain.Article;
import com.cicd.simpleDemo.domain.dto.ArticleDto;
import com.cicd.simpleDemo.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;


    public ArticleDto create(ArticleDto articleDto) {
        Article savedarticle = articleRepository.save(articleDto.toEntity());
        return ArticleDto.fromEntity(savedarticle);
    }

    public ArticleDto get(Long articleId) {
        return articleRepository.findById(articleId)
                .map(ArticleDto::fromEntity)
                .orElseThrow();
    }

    public ArticleDto update(ArticleDto articleDto) {
        Article article = articleRepository.getReferenceById(articleDto.id());
        if (articleDto.title() != null) {
            article.setTitle(articleDto.title());
        }
        if (articleDto.content() != null) {
            article.setContent(articleDto.content());
        }
        Article updatearticle = articleRepository.save(article);
        return ArticleDto.fromEntity(updatearticle);
    }

    public void delete(Long articleId) {
        articleRepository.deleteById(articleId);
    }
}
