package com.jw.webprototype.exception;

public class PKDuplicationException extends RuntimeException{

    public PKDuplicationException() {
        super();
    }

    public PKDuplicationException(String message) {
        super(message);
    }

    public PKDuplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public PKDuplicationException(Throwable cause) {
        super(cause);
    }

    protected PKDuplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
