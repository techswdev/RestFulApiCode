package com.example.demo.dto;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public enum StatusEnum {

    OK(200,"OK"),
    NOT_FOUND(404,"NOT_FOUND"),
    INTERNAL_SERVER_ERROR(500,"INTERNAL_SERVER_ERROR"),
    BAD_REQUEST(400,"BAD_REQUEST");

    int statusCode;
    String code;


}
