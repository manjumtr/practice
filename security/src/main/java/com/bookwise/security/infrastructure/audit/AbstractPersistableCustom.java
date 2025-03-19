package com.bookwise.security.infrastructure.audit;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.domain.Persistable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class AbstractPersistableCustom<PK> implements Persistable<PK> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private PK id;

    @Version
    private Integer version;

    @Override
    public boolean isNew() {
        return null == getId();
    }

    @Override
    public PK getId() {
        return this.id;
    }

}
