package com.pro100kryto.server.services.auth.connection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public final class UserConnNotFound extends Exception{
    private final int connId;
}
