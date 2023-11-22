import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Number extends Remote {
    public void add(int i) throws RemoteException;
    public int value() throws RemoteException;
}