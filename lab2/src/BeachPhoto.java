import java.io.Serializable;

class BeachPhoto extends Photo implements Serializable {

    private String signed;

    public BeachPhoto(String type, int bin, String signed) {
        super(type, bin);
        this.signed = signed;
    }

    public String getSigned() {
        return signed;
    }

    @Override
    public void display(){
        System.out.printf("%s, %d  \n", getType(), getSigned());
    }
}
