package com.japik.services.auth.connection;

public class AuthInternalErrorException extends AuthorizationException {
    public AuthInternalErrorException(Throwable cause) {
        super(cause);
    }
}
