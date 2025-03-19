package com.bookwise.security.infrastructure.exception.resourcenotfound;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bookwise.security.infrastructure.exception.data.PlatformExceptionResponse;

public class AbstractResourceNotFoundExceptionHandler {

    @ExceptionHandler(value = { AbstractResourceNotFoundException.class })
    public ResponseEntity<Object> handleException(AbstractResourceNotFoundException e) {
        PlatformExceptionResponse response = PlatformExceptionResponse.builder()
                .message(e.getMessage())
                .code(e.getCode())
                .status(HttpStatus.NOT_FOUND.value())
                .args(e.getArgs())
                .build();
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

}
