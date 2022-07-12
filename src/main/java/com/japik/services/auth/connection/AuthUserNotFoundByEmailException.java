package com.japik.services.auth.connection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class AuthUserNotFoundByEmailException extends AuthUserNotFoundException {
    private final String email;
}
