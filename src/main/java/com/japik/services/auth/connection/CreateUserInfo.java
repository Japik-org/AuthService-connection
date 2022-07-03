package com.japik.services.auth.connection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.HashMap;

@Getter @Setter
@RequiredArgsConstructor
public class CreateUserInfo {
    private final HashMap<Object, Object> values = new HashMap<>(16);
    private final String username;
    private final byte[] pass;

    public CreateUserInfo append(Object key, Object value) {
        values.put(key, value);
        return this;
    }
}
