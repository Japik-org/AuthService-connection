package com.japik.services.auth.connection;

import com.japik.service.IServiceConnection;

import java.rmi.RemoteException;

public interface IAuthServiceConnection extends IServiceConnection {

    long createUser(CreateUserInfo userInfo) throws RemoteException, UserAlreadyExistsException;

    IUserConn authorizeByUserId(long userId, byte[] pass) throws RemoteException, AuthorizationException;
    IUserConn authorizeByKeyVal(Object key, Object val, byte[] pass) throws RemoteException, AuthorizationException;

    IUserConn getUserConnByConnId(int connId) throws RemoteException, UserConnNotFound;

    boolean isAuthorizedByConnId(int connId) throws RemoteException;
    boolean isAuthorizedByUserId(long userId) throws RemoteException;

    boolean dismissAuthorizationByConnId(int connId) throws RemoteException;
    boolean dismissAllAuthorizationsByUserId(long userId) throws RemoteException;

}
