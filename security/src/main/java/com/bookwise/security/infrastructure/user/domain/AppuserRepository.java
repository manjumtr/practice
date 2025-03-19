package com.bookwise.security.infrastructure.user.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppuserRepository extends JpaRepository<AppUser, Long> {

    AppUser findByUsername(String username);

}
