package com.bookwise.security.infrastructure.user.domain;

import com.bookwise.security.infrastructure.audit.AbstractPersistableCustom;

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
@Table(name = "permission")
public class Permission extends AbstractPersistableCustom<Long> {

    @Column(name = "name")
    private String name;
}
