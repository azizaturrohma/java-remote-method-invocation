package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    
    public static void main(String[] args) throws NotBoundException,
            MalformedURLException, RemoteException {
        DataInterface data = (DataInterface) Naming.lookup("rmi://localhost:1099/data");
        System.out.println("Client is connect to Server");

        data.FirstMethod();
        data.SecondMethod();

        System.out.println("finish");
        }

}
