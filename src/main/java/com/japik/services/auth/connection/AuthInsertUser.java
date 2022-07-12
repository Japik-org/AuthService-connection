package com.japik.services.auth.connection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AuthInsertUser implements IAuthInsertUser {
    private final String username;
    private final String email;
    private final byte[] pass;
}
