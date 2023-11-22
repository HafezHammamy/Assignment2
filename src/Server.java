import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Number {
    private int number;

    protected Server() throws RemoteException {
    }

    public void Number() throws RemoteException {
    }

    public synchronized void add(int i) {
        number = number + i;
    }

    public synchronized int value() {
        return number;
    }
}