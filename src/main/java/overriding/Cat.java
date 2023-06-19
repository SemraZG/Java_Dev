package overriding;

public class Cat extends Animal{
    public void meow(){
        System.out.println("cats meow..");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat..");
    }

    @Override
    public Animal create() {
        return new Cat();
    }
}
