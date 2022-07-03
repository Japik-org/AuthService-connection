package com.japik.services.auth.connection;

import java.io.Closeable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IUserConn extends Remote, Closeable {
    int getConnId() throws RemoteException;
    long getUserId() throws RemoteException;
    String getNickname() throws RemoteException;

    boolean checkSign(byte[] sign, byte[] src) throws RemoteException;
    boolean checkPass(byte[] pass) throws RemoteException;

    void close() throws RemoteException;
    boolean isClosed() throws RemoteException;
}
