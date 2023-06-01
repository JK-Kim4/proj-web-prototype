package com.jw.webprototype.exception;

public class CannotFindUserException extends RuntimeException{

    public CannotFindUserException() {
        super();
    }

    public CannotFindUserException(String message) {
        super(message);
    }

    public CannotFindUserException(String message, Throwable cause) {
        super(message, cause);
    }

    public CannotFindUserException(Throwable cause) {
        super(cause);
    }

    protected CannotFindUserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
