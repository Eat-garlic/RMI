package main.java.com.eglc;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) throws RemoteException, NotBoundException {

        //先要在芸芸网络中找到注册中心端， 这个ip 和 端口 是明确的
        Registry registry = LocateRegistry.getRegistry("127.0.0.1",1099);
        //然后在注册中心端中找到要调用 的对象，
        //如果两端接口不一样，我们那么服务端的接口实现   注册到注册，我们那么服务端的接口实现  绑定到到注册端上来，客户端找到注册端后进行调用接口的方法 ，因为接口不一样，所以 压根就没办法调用到想要的业务逻辑代码
        //寻找到要执行的对象，然后向下转型
        IRemoteObj remoteObj =(IRemoteObj) registry.lookup("remoteObj");
        remoteObj.sayhello("cwzj");


    }

}
