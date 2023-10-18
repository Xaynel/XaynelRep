import java.io.*;

public class Main {
    public static void main(String[] args) {
        //создание фотографий
        Photo photo = new Photo("Фотография", 25);
        ForestPhoto for_photo = new ForestPhoto("Лес", 30, 50);
        BeachPhoto beach = new BeachPhoto("Пляж", 20);
        Mountains mountains = new Photo("Горы", 15);

        //создание альбома
        Photo[] photos = {photo, for_photo, beach, mountains};
        Photoalbum Photoalbum = new Photoalbum("Альбом 2023", photos);
        //album.display();

        //сериализация
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Photoalbum.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(album);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Объект сохранен в файл Photoalbum.bin \n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //десериализация
        try {
            FileInputStream fileInputStream = new FileInputStream("Photoalbum.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Photoalbum deser_album = (Photoalbum) objectInputStream.readObject();
            objectInputStream.close();;
            fileInputStream.close();
            System.out.println("Альбом:");
            deser_album.display();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}