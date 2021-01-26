package rmi.example;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class AddServer {
    public static void main(String[] args) {
        try {
            AddServerImpl addServer = new AddServerImpl();

            Context context = new InitialContext();
            context.rebind("rmi://localhost:1099/addServer", addServer);
//-Djava.rmi.server.codebase=http://localhost:1099/addServer
            //Naming.rebind("addServer", addServer);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
//        catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
        catch (NamingException e) {
            e.printStackTrace();
        }
    }
}

