package com.japik.services.auth.connection;

public class AuthorizationDisabledException extends AuthorizationException {
    public AuthorizationDisabledException() {
    }

    public AuthorizationDisabledException(String message) {
        super(message);
    }
}
