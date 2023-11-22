import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Main {
    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        Number num = (Number) Naming.lookup("rmi://localhost:1099/progressNum");
        num.add(10);
    }
}