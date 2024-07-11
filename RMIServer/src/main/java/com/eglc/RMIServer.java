package main.java.com.eglc;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        IRemoteObj remoteObj = new IRemoteObjImpl();
        //按照之前jdk的版本，注册中心是需要在另外一台机器上创建的，jdk几点几之后，为了方便，注册中心直接在服务器上了默认。
        Registry r = LocateRegistry.createRegistry(1099);

        r.bind("remoteObj",remoteObj);

    }
}
