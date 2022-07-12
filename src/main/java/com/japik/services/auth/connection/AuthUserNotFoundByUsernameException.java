package com.japik.services.auth.connection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class AuthUserNotFoundByUsernameException extends AuthUserNotFoundException {
    private final String username;
}
