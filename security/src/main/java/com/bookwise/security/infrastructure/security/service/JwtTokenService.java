package com.bookwise.security.infrastructure.security.service;

import com.bookwise.security.infrastructure.security.data.TokenPayload;
import com.bookwise.security.infrastructure.security.data.TokenResponse;
import com.bookwise.security.infrastructure.user.domain.AppUser;

public interface JwtTokenService {

    String extractUsername(final String jwt);

    TokenResponse generateToken(final TokenPayload payload);

    TokenResponse isTokenValid(final String token);

    AppUser authenticate();

}
