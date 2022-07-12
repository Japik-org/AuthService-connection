package com.japik.services.auth.connection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class AuthUserAlreadyAuthorizedException extends AuthorizationException {
    private final IUserConn userConn;
}
