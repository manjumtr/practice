package com.bookwise.security.infrastructure.security.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookwise.security.infrastructure.security.data.TokenPayload;
import com.bookwise.security.infrastructure.security.data.TokenResponse;
import com.bookwise.security.infrastructure.security.service.JwtTokenService;
import com.bookwise.security.infrastructure.security.service.PlatformAuthenticationService;
import com.bookwise.security.infrastructure.user.domain.AppUser;

@RestController
@RequestMapping("/api/open/")
@Component
public class TokenApiResource {

    private final JwtTokenService jwtTokenService;
    private final PlatformAuthenticationService platformAuthenticationService;

    @Autowired
    public TokenApiResource(JwtTokenService jwtTokenService,
            PlatformAuthenticationService platformAuthenticationService) {
        this.jwtTokenService = jwtTokenService;
        this.platformAuthenticationService = platformAuthenticationService;
    }

    @PostMapping("token")
    TokenResponse getToken(@RequestBody final TokenPayload payload) {
        return this.platformAuthenticationService.genarateToken(payload);
    }

    @GetMapping("authenticate")
    public AppUser authenticate() {
        return this.jwtTokenService.authenticate();
    }

    @GetMapping("token")
    public TokenResponse validate(@RequestBody TokenPayload payload) {
        return this.jwtTokenService.isTokenValid(payload.getToken());
    }

}
