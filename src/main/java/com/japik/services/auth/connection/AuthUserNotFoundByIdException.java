package com.japik.services.auth.connection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class AuthUserNotFoundByIdException extends AuthUserNotFoundException {
    private final long id;
}
