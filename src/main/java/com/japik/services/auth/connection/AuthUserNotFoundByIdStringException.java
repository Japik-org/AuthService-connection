package com.japik.services.auth.connection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class AuthUserNotFoundByIdStringException extends AuthUserNotFoundException {
    private final String userIdString;
}
