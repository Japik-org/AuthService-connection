package com.pro100kryto.server.services.auth.connection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserAlreadyExistsException extends AuthorizationException {
    private final long userId;
}
