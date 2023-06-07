package overloading;

public class Overloading01 {
    public static void main(String[] args) {
        /**
        1-In Method Overloading, method name are not changed.
        2-In Method Overloading, parameters are changed.
            Parametreleri değiştirirken, parametrelerin data typeı, sayısı veya data trypeları farklı olan parametlerin yerleri değiştirilerek overloading yapılır.
            Method name + Method Pameters = Method Signature

            Overloading yapılırken return typeı değiştirmenin, access mod ı değiştirmenin, static veya non-static olmasının veya method body nin değiştirilmesinin bir önemi yoktur.

            Private methodlar overload edilebilir çünkü overloading tek bir classın içinde yapılır, private olmak baska classlara gidildiğinde problem olur.

            Static methodlar overload edilebilir.

         */
        add(3.0,5);

    }
//    public static void add(int a, int b){
//        System.out.println(a+b);
//    }
    public static void add(double a, double b){
        System.out.println(a+b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a+b);
    }
}
