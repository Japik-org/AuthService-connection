package com.japik.services.auth.connection;

import com.japik.service.IServiceConnection;

import java.rmi.RemoteException;

public interface IAuthServiceConnection extends IServiceConnection {

    Object createUser(IAuthInsertUser userInfo) throws RemoteException, AuthorizationException;

    IUserConn authorizeByUserId(Object userId, byte[] pass) throws RemoteException, AuthorizationException;
    IUserConn authorizeByUserIdString(String userIdString, byte[] pass) throws RemoteException, AuthorizationException;
    IUserConn authorizeByUsername(String username, byte[] pass) throws RemoteException, AuthorizationException;
    IUserConn authorizeByEmail(String email, byte[] pass) throws RemoteException, AuthorizationException;

    IUserConn getUserConnByConnId(int connId) throws RemoteException, AuthorizationException;

    boolean isAuthorizedByConnId(int connId) throws RemoteException, AuthorizationException;
    boolean isAuthorizedByUserId(Object userId) throws RemoteException, AuthorizationException;
    boolean isAuthorizedByUsername(String username) throws RemoteException, AuthorizationException;

    void dismissAuthorizationByConnId(int connId) throws RemoteException, AuthorizationException;
    void dismissAuthorizationsByUserId(Object userId) throws RemoteException, AuthorizationException;

}
