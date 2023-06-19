package constructor;

public class CarRunner {
    public static void main(String[] args) {

        Car car1=new Car("BMW", "M4", 2023, false);
        Car car2=new Car("audi", "R8", 2022, true);
        Car car3=new Car("Honda", "Civic", 2020, false);

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);

        Car car4=new Car("Merdeces", "C3000");
        System.out.println(car4);
    }
}
