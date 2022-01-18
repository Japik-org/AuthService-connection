package com.pro100kryto.server.services.auth.connection;

import com.pro100kryto.server.service.IServiceConnection;

public interface IAuthServiceConnection extends IServiceConnection {

    IUserConn authorizeByUserId(long userId, byte[] pass) throws AuthorizationException;
    IUserConn authorizeByKeyVal(Object key, Object val, byte[] pass) throws AuthorizationException;

    IUserConn getUserConnByConnId(int connId) throws UserConnNotFound;

    boolean isAuthorizedByConnId(int connId);
    boolean isAuthorizedByUserId(long userId);

    boolean dismissAuthorizationByConnId(int connId);
    boolean dismissAllAuthorizationsByUserId(long userId);

}
