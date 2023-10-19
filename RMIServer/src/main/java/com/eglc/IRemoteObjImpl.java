package main.java.com.eglc;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IRemoteObjImpl extends UnicastRemoteObject implements IRemoteObj {
    protected IRemoteObjImpl() throws RemoteException {
    }

    @Override
    public String sayhello(String keyword) throws RemoteException {

        String s = keyword.toUpperCase();
        System.out.println(s);
        return s;

    }
}
