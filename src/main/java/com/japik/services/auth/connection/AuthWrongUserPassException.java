package com.japik.services.auth.connection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class AuthWrongUserPassException extends AuthorizationException {
    private final Object UserId;
}
