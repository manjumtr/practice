package com.bookwise.security.infrastructure.user.domain;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppuserRepositoryWrapper {

    private final AppuserRepository appuserRepository;

    @Autowired
    public AppuserRepositoryWrapper(AppuserRepository appuserRepository) {
        this.appuserRepository = appuserRepository;
    }

    public AppUser findByUsername(String username) {
        return appuserRepository.findByUsername(username);
    }

    public boolean userExists(String username) {
        AppUser user = appuserRepository.findByUsername(username);
        return Objects.nonNull(user) ? true : false;
    }
}
