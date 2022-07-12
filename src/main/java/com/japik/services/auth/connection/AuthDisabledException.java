package com.japik.services.auth.connection;

public class AuthDisabledException extends AuthorizationException {
    public AuthDisabledException() {
    }

    public AuthDisabledException(String message) {
        super(message);
    }
}
