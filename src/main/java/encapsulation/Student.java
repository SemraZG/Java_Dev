package encapsulation;

public class Student {

    private String id="AC202306014";
    public String name="Ali can";
    public int age=13;
    private double notOrt=3.13;
    private boolean successfull=false;

    public String getId() { //sağ click+generate+get+id
        return id;
    }

    public double getNotOrt() {
        return notOrt;
    }
}
