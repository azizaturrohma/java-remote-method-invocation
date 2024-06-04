package salam;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Salam extends UnicastRemoteObject implements SalamInterface {
    public Salam() throws RemoteException {
    }

    @Override
    public void salam(String nama) throws RemoteException {
        System.out.println("Assalamu'alaikum " + nama);
        ;
    }
}
