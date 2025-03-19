package com.bookwise.security.infrastructure.security.data;

import lombok.Data;

@Data
public class TokenPayload {
    private String username;
    private String password;
    private String token;

}
