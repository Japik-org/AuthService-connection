package com.pro100kryto.server.services.auth.connection;

import java.io.Closeable;

public interface IUserConn extends Closeable {
    int getConnId();
    long getUserId();
    String getNickname();

    boolean checkSign(byte[] sign, byte[] src);
    boolean checkPass(byte[] pass);

    void close();
    boolean isClosed();
}
