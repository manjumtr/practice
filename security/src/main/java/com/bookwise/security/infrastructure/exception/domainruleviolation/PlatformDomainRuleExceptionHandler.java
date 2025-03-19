package com.bookwise.security.infrastructure.exception.domainruleviolation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.bookwise.security.infrastructure.exception.data.PlatformExceptionResponse;

@RestController
@ControllerAdvice
public class PlatformDomainRuleExceptionHandler {

    @ExceptionHandler(value = { AbstractDomainRuleException.class })
    public ResponseEntity<Object> handleException(AbstractDomainRuleException e) {
        PlatformExceptionResponse response = PlatformExceptionResponse.builder()
                .message(e.getMessage())
                .code(e.getCode())
                .status(HttpStatus.FORBIDDEN.value())
                .args(e.getArgs())
                .build();
        return new ResponseEntity<>(response, HttpStatus.FORBIDDEN);
    }

}
