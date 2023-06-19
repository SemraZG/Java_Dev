package overriding;

public class Animal {

    public void eat(){
        System.out.println("Animals eat..");
    }

    public Animal create(){
        return new Animal();
    }
}
