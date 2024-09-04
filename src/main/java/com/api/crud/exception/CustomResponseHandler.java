package com.api.crud.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
public class CustomResponseHandler {

    private final LocalDateTime date;
    private final HttpStatus status;
    private final int code;
    private final String message;

    public CustomResponseHandler(HttpStatus status, int code, String message) {
        this.date = LocalDateTime.now();
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
