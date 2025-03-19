package com.bookwise.security.infrastructure.exception.domainruleviolation;

public abstract class AbstractDomainRuleException extends RuntimeException {
    private String message;
    private String code;
    private Object[] args;

    public AbstractDomainRuleException(final String code, final String message, final Object... args) {
        this.code = code;
        this.message = message;
        this.args = args;
    }

    public String getMessage() {
        return this.message;
    }

    public String getCode() {
        return this.code;
    }

    public Object[] getArgs() {
        return this.args;
    }

}
