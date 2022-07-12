package com.japik.services.auth.connection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class AuthUserConnNotFoundException extends AuthorizationException{
    private final int connId;
}
