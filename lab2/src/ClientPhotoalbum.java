import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientPhotoalbum {

    public static final String UNIQUE_HOST_NAME = "server.photoalbum";
    public static final int PORT = 8080;

    public static void main(String[] args) throws RemoteException, NotBoundException {

        final Registry registry = LocateRegistry.getRegistry(PORT);

        PhotoalbumBase photoalbum = (PhotoalbumBase) registry.lookup(UNIQUE_HOST_NAME);
        photoalbum.display();
    }
}
