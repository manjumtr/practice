package com.bookwise.security.infrastructure.command.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandAuditRepository extends CrudRepository<CommandAudit, Long> {

}
