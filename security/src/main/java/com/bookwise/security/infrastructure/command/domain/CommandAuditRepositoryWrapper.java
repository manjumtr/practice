package com.bookwise.security.infrastructure.command.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandAuditRepositoryWrapper {
    private final CommandAuditRepository repository;

    @Autowired
    public CommandAuditRepositoryWrapper(final CommandAuditRepository repository) {
        this.repository = repository;
    }

    public void save(final CommandAudit audit) {
        this.repository.save(audit);
    }

}
