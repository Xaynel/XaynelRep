import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PhotoalbumBase extends Remote {
    void display() throws RemoteException;
}
