import java.io.*;

class Photo implements Serializable {
    private String imagePath;

    public Photo(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }
}

class PhotoAlbum implements Serializable {
    private String albumName;
    private Photo[] photos;

    public PhotoAlbum(String albumName, Photo[] photos) {
        this.albumName = albumName;
        this.photos = photos;
    }

    public String getAlbumName() {
        return albumName;
    }

    public Photo[] getPhotos() {
        return photos;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание объектов фотографий
        Photo photo1 = new Photo("photo1.jpg");
        Photo photo2 = new Photo("photo2.jpg");
        Photo photo3 = new Photo("photo3.jpg");

        // Создание объекта фотоальбома
        Photo[] photos = {photo1, photo2, photo3};
        PhotoAlbum album = new PhotoAlbum("My Album", photos);

        // Сериализация объекта фотоальбома в файл
        try {
            FileOutputStream fileOut = new FileOutputStream("photoalbum.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(album);
            out.close();
            fileOut.close();
            System.out.println("Фотоальбом сериализован в файл photoalbum.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десериализация объекта фотоальбома из файла
        try {
            FileInputStream fileIn = new FileInputStream("photoalbum.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            PhotoAlbum deserializedAlbum = (PhotoAlbum) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Десериализованный фотоальбом: " + deserializedAlbum.getAlbumName());
            System.out.println("Фотографии в альбоме:");
            for (Photo photo : deserializedAlbum.getPhotos()) {
                System.out.println(photo.getImagePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}