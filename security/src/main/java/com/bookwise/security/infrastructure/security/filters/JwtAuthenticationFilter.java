package com.bookwise.security.infrastructure.security.filters;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

import com.bookwise.security.infrastructure.security.service.JwtTokenService;
import com.bookwise.security.infrastructure.user.domain.AppUser;
import com.bookwise.security.infrastructure.user.domain.AppuserRepositoryWrapper;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtTokenService jwtTokenService;
    private final AppuserRepositoryWrapper appUserRepository;

    public JwtAuthenticationFilter(JwtTokenService jwtTokenService, AppuserRepositoryWrapper appUserRepository) {
        this.jwtTokenService = jwtTokenService;
        this.appUserRepository = appUserRepository;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        final String authHeader = request.getHeader("Authorization");
        if (authHeader == null || !authHeader.startsWith("Bearer")) {
            filterChain.doFilter(request, response);
            return;
        }

        String token = authHeader.substring(7);
        String username = this.jwtTokenService.extractUsername(token);

        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            // AppUser customer = this.appUserRepository.findByUsername(username);
            AppUser customer = this.appUserRepository.findByUsername(username);
            if (this.jwtTokenService.isTokenValid(token).isValid()) {
                UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(customer, null,
                        null);
                auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(auth);
            }
        }
        filterChain.doFilter(request, response);
    }

}
