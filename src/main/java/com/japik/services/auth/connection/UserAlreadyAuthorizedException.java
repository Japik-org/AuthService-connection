package com.japik.services.auth.connection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserAlreadyAuthorizedException extends AuthorizationException {
    private final IUserConn userConn;
}
