import java.io.Serializable;

class ForestPhoto extends Photo implements Serializable {

    private int beds;

    public ForestPhoto(String type, int square, int photos) {
        super(type, square);
        this.photos = photos;
    }

    public int getPhotos() {
        return photos;
    }

    @Override
    public void display(){
        System.out.printf("%s, %d фотографий \n", getType(),  getPhotos());
    }

}