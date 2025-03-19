package com.bookwise.security.infrastructure.audit;

import java.time.LocalDate;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class AbstractAuditableCustom<PK> extends AbstractPersistableCustom<PK> {

    @CreatedDate
    @Column(name = "created_date")
    private LocalDate createdDate;

    @LastModifiedDate
    @Column(name = "last_modified_date")
    private LocalDate lastModifiedDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "last_modified_by")
    private LocalDate lastModifiedBy;

}
