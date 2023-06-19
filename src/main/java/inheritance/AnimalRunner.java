package inheritance;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat cat=new Cat();
        cat.meow();//Cats meow..
        cat.eat();//Animals eat..-->parentdan kullndı
        cat.drink();//Animals drink..

        Dog dog=new Dog();
        dog.bark();//Dogs bark..
        dog.drink();//Animals drink..
    }
}
