package com.cicd.simpleDemo.domain.dto;

public record HelloDTO(
        String message
) {

    public static HelloDTO of(String message) {
        return new HelloDTO(message);
    }

}
