package com.cicd.simpleDemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 모든 엔드포인트에 대한 CORS 설정
                .allowedOrigins("*") // 모든 도메인에서의 요청 허용
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 원하는 HTTP 메서드 허용
                .allowedHeaders("*"); // 모든 헤더 허용
    }
}