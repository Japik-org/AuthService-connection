package com.pro100kryto.server.services.auth.connection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserNotFoundException extends AuthorizationException {
    private final Object key;
    private final Object val;
}
