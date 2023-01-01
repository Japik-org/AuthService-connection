package com.japik.services.auth.connection;

import java.io.Closeable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IUserConn extends Remote, Closeable {
    int getConnId() throws RemoteException;
    Object getUserId() throws RemoteException;
    String getUsername() throws RemoteException;

    boolean checkSign(byte[] sign, byte[] src) throws RemoteException;

    void close() throws RemoteException;
    boolean isClosed() throws RemoteException;
}
