package encapsulation;

public class Runner {
    public static void main(String[] args) {
        Student student1=new Student();
        System.out.println(student1.getId());//Encapsulation classında get methodu ile encapsule edilmiş dayatı burdan okuyabildik.

        System.out.println(student1.getNotOrt());
    }
}
