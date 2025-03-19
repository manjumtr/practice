package com.bookwise.security.infrastructure.security.service;

import java.util.Objects;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bookwise.security.infrastructure.security.data.TokenPayload;
import com.bookwise.security.infrastructure.security.data.TokenResponse;
import com.bookwise.security.infrastructure.security.exception.InvalidCredentialsException;
import com.bookwise.security.infrastructure.user.domain.AppUser;
import com.bookwise.security.infrastructure.user.domain.AppuserRepositoryWrapper;
import com.bookwise.security.infrastructure.user.exception.AppUserNotFoundException;

@Service
public class PlatformAuthenticationService {

    private final AppuserRepositoryWrapper appUserRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenService jwtTokenService;

    public PlatformAuthenticationService(AppuserRepositoryWrapper appUserRepository, PasswordEncoder passwordEncoder,
            JwtTokenService jwtTokenService) {
        this.appUserRepository = appUserRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtTokenService = jwtTokenService;
    }

    public TokenResponse genarateToken(final TokenPayload payload) {
        AppUser appUser = this.appUserRepository.findByUsername(payload.getUsername());
        if (Objects.isNull(appUser)) {
            throw new AppUserNotFoundException(payload.getUsername());
        }
        final boolean isPasswordValid = this.passwordEncoder.matches(payload.getPassword(), appUser.getPassword());
        if (isPasswordValid) {
            return this.jwtTokenService.generateToken(payload);
        }
        throw new InvalidCredentialsException();
    }

}
