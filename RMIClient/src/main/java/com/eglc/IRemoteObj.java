package main.java.com.eglc;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemoteObj extends Remote {
    String sayhello (String keyword) throws RemoteException;
}
