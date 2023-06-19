package inheritance;

public class Car extends Vehicle{
    public Car(){
        super();
        System.out.println("Car1..");
    }

    public Car(String make){
        super(20000);
        System.out.println("Car 2..");
    }
}
