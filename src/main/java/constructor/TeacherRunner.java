package constructor;

public class TeacherRunner {
    public static void main(String[] args) {

        Teacher t1=new Teacher("Ali Can");
        Teacher t2=new Teacher("Ahmet Vsnlı", 41, "Ankara");

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
    }
}
