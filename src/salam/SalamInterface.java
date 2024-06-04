package salam;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SalamInterface extends Remote {

    public void salam(String nama) throws RemoteException;
}