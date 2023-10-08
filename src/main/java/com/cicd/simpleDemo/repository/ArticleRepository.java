package com.cicd.simpleDemo.repository;

import com.cicd.simpleDemo.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ArticleRepository extends JpaRepository<Article, Long> {



}
