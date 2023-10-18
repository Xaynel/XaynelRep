import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerPhotoalbum {

    public static final String UNIQUE_HOST_NAME = "server.photoalbum";
    public static final int PORT = 8080;

    public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException {

        Photo photo = new Photo("Фото", 5);
        ForestPhoto for_photo = new ForestPhoto("Лес", 30);
        BeachPhoto beach = new BeachPhoto("Пляж", 20 );
        MountainPhoto mountains = new Mounaints("Горы", 15);

        //создание альбома
        Photo[] photos = {photo, for_photo, beach, mountains};
        Photoalbum photoalbum = new Photoalbum("Альбом 2023", photo);

        final Registry registry = LocateRegistry.createRegistry(PORT);

        Remote stub = UnicastRemoteObject.exportObject(Photoalbum, 0);
        registry.bind(UNIQUE_HOST_NAME, stub);

        Thread.sleep(Integer.MAX_VALUE);
    }
}
