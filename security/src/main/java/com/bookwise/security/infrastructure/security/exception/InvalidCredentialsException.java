package com.bookwise.security.infrastructure.security.exception;

import com.bookwise.security.infrastructure.exception.domainruleviolation.AbstractDomainRuleException;

public class InvalidCredentialsException extends AbstractDomainRuleException {

    public InvalidCredentialsException() {
        super("error.msg.invalid.credentials", "Invalid credentials");
    }

}
