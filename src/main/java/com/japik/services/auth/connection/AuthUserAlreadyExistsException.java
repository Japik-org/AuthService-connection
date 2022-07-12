package com.japik.services.auth.connection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class AuthUserAlreadyExistsException extends AuthorizationException {
    private final long userId;
}
