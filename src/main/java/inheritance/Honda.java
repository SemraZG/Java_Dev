package inheritance;

public class Honda extends Car{
    public Honda(){
        super("civic");//normalde bu keyword gorunmezdı manuel olrak gorunur yaptık, super bizi parenta goturur alttakı constructor çalısmadan once.
        System.out.println("Honda1..");
    }

    public Honda(String make, int year){
        System.out.println("Honda 2..");
    }
}
