package constructor;

public class Teacher {

    String name;
    int age;
    String address;

    public Teacher(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Teacher(String name) {
        this.name = name;
    }

    @Override//bu blok consolda yazdırabilmek için sadece
    public String toString() {
        return "TeacherRunner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
