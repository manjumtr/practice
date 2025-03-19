package com.bookwise.security.infrastructure.exception.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PlatformExceptionResponse {

    private final String message;
    private final String code;
    private final int status;
    private final Object[] args;

}
