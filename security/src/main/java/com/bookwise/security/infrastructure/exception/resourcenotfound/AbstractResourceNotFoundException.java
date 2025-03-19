package com.bookwise.security.infrastructure.exception.resourcenotfound;

public abstract class AbstractResourceNotFoundException extends RuntimeException {

    private String message;
    private String code;
    private Object[] args;

    protected AbstractResourceNotFoundException(final String code, final String message, final Object... args) {
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
