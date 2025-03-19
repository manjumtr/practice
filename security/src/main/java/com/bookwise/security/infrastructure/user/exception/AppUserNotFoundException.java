package com.bookwise.security.infrastructure.user.exception;

import com.bookwise.security.infrastructure.exception.domainruleviolation.AbstractDomainRuleException;

public class AppUserNotFoundException extends AbstractDomainRuleException {
    public AppUserNotFoundException(final String userName) {
        super("user.not.found", "User with username %s not found", userName);
    }

}
