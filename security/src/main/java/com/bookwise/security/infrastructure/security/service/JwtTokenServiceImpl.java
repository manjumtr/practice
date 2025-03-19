package com.bookwise.security.infrastructure.security.service;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Objects;
import java.util.function.Function;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.bookwise.security.infrastructure.security.data.SecurityConstants;
import com.bookwise.security.infrastructure.security.data.TokenPayload;
import com.bookwise.security.infrastructure.security.data.TokenResponse;
import com.bookwise.security.infrastructure.security.exception.InvalidTokenException;
import com.bookwise.security.infrastructure.user.domain.AppUser;
import com.bookwise.security.infrastructure.user.domain.AppuserRepositoryWrapper;
import com.bookwise.security.infrastructure.user.exception.AppUserNotFoundException;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtTokenServiceImpl implements JwtTokenService {
    private final AppuserRepositoryWrapper appUserRepository;

    @Autowired
    public JwtTokenServiceImpl(final AppuserRepositoryWrapper appUserRepository) {
        this.appUserRepository = appUserRepository;

    }

    @Override
    public String extractUsername(String jwt) {
        return extractClaim(jwt, Claims::getSubject);
    }

    @Override
    public TokenResponse generateToken(TokenPayload payload) {
        final String username = payload.getUsername();
        AppUser appUser = this.appUserRepository.findByUsername(username);
        if (Objects.isNull(appUser)) {
            throw new AppUserNotFoundException(username);
        }
        final Date issuedAt = new Date();
        final Date expiresOn = new Date((new Date()).getTime() + 30000000);

        SecretKey key = Keys.hmacShaKeyFor(SecurityConstants.JWT_KEY.getBytes(StandardCharsets.UTF_8));
        String token = Jwts.builder().issuer(SecurityConstants.TOKEN_ISSUER).subject(username).claims(null)
                .issuedAt(issuedAt)
                .expiration(expiresOn).signWith(key).compact();
        TokenResponse response = TokenResponse.builder().token(token).issuedAt(issuedAt).expiresOn(expiresOn).build();
        return response;
    }

    @Override
    public TokenResponse isTokenValid(String token) {
        final String username = extractUsername(token);
        if (this.appUserRepository.userExists(username) && !isTokenExpired(token)) {
            return TokenResponse.builder().isValid(true).build();
        }
        return TokenResponse.builder().isValid(false).build();
    }

    @Override
    public AppUser authenticate() {
        AppUser appUser = (AppUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (Objects.isNull(appUser)) {
            return null;
        }
        return appUser;
    }

    private <T> T extractClaim(final String token, Function<Claims, T> claimResolver) {
        final Claims claims = extractAllClaims(token);
        return claimResolver.apply(claims);
    }

    @SuppressWarnings("deprecation")
    private Claims extractAllClaims(final String token) {
        SecretKey key = Keys.hmacShaKeyFor(SecurityConstants.JWT_KEY.getBytes(StandardCharsets.UTF_8));
        return Jwts.parser().setSigningKey(key).build().parseClaimsJws(token).getBody();
    }

    private boolean isTokenExpired(final String token) {
        return extractExpiration(token).before(new Date());

    }

    private Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

}
