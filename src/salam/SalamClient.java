package salam;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class SalamClient {

    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        Scanner sc = new Scanner(System.in);
        SalamInterface salam = (SalamInterface) Naming.lookup("rmi://localhost:1099/salam");
        System.out.println("Client is connect to Server");

        System.out.print("Masukkan nama: ");
        String nama = sc.next();
        salam.salam(nama);

        System.out.println("finish");
    }
}
