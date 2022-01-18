package com.pro100kryto.server.services.auth.connection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class WrongUserPassException extends AuthorizationException {
    private final long UserId;
}
