package com.qingmu.server.exception;

public class RpcInvocationException extends RuntimeException {

    public RpcInvocationException() {
        super();
    }

    public RpcInvocationException(String message) {
        super(message);
    }

    public RpcInvocationException(String message, Throwable cause) {
        super(message, cause);
    }

    public RpcInvocationException(Throwable cause) {
        super(cause);
    }

    protected RpcInvocationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
