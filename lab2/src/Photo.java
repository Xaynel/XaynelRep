import java.io.Serializable;

public class photo implements Serializable {

    private String type;
    private int square;

    public photo(String type, int square) {
        this.type = type;
        this.square = square;
    }

    public String getType() {
        return type;
    }

    public int getSquare() {
        return square;
    }

    public void display(){
        System.out.printf("%s, %d m^2 \n", getType(), getSquare());
    }
}
