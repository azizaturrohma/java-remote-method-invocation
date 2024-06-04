package salam;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SalamServer {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.createRegistry(1099);

        Salam salam = new Salam();
        registry.rebind("salam", salam);

        System.out.println("Server is running");
    }
}
