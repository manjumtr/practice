package com.bookwise.security.infrastructure.command.domain;

import com.bookwise.security.infrastructure.audit.AbstractAuditableCustom;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "command_audit")
public class CommandAudit extends AbstractAuditableCustom<Long> {

    @Column(name = "entity")
    private String entity;

    @Column(name = "action")
    private String action;

    @Column(name = "url")
    private String url;

    @Column(name = "method")
    private String method;

    @Column(name = "payload")
    private String payload;

}
