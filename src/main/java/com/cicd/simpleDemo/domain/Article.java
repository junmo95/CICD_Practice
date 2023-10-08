package com.cicd.simpleDemo.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@ToString
@Entity
public class Article extends AuditingFields{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Setter
    @Column(columnDefinition = "varchar(50) DEFAULT NULL COMMENT '제목을 입력하세요.'")
    private String title;


    @Setter
    @Column(columnDefinition = "varchar(1000) DEFAULT NULL COMMENT '본문을 입력하세요.'")
    private String content;




    // 생성자를 통해 엔티티 함부로 생성 못하게 함
    protected Article() {
    }

    private Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // 이 Article 클래스(엔티티)의 of 함수로만 객체 생성가능
    public static Article of(String title, String content) {
        return new Article(title, content);
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(id, article.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
