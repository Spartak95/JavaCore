package rmi.example;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class AddClient {
    public static void main(String[] args) {
        try {
            String addServerURL = "rmi://localhost:1099/addServer";
            AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerURL);
            double d1 = 3.0;
            System.out.println("Առաջին թիվը " + d1);
            double d2 = 4.0;
            System.out.println("Երկրորդ թիվը " + d2);
            System.out.println("Երկու թվերի գումարը " + addServerIntf.add(d1, d2));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}

