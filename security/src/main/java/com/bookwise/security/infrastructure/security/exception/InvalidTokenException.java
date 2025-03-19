package com.bookwise.security.infrastructure.security.exception;

import com.bookwise.security.infrastructure.exception.domainruleviolation.AbstractDomainRuleException;

public class InvalidTokenException extends AbstractDomainRuleException {

    public InvalidTokenException() {
        super("error.msg.invalid.token", "Invalid token");
    }

}
