package com.bookwise.security.infrastructure.security.data;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TokenResponse {
    private String token;
    private Date issuedAt;
    private Date expiresOn;
    private boolean isValid;

}
