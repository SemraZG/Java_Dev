package staticKeyword;

public class Student {

        /**
         * Static variable veya static methodlar(class members) tüm objectler için ortak elemandır.
         * Static class memberlar uerinde yapılan tüm değişiklikler tum objectleri etkiler.
         * Static class memberlar Class'a, non-static memberlar objectlere monte edilir.
         * Mesela; bir classdan uz tane object urettiğimizde non-static olanlar da yuz kere olusturulur,
           ama static olanlar object sayıısndan bagımszı olarak bir kere olusturulurlar.
         * Static class memberlara ulasmak için o classdan object uretmeye gerek yoktur,
           ama non-static memberlara ulasmak için o classdan object uretmek zorundayız.
         * Static variabların diğer adı Class Variable dır,
         * Non-static variabların diğer adı Instance Variable veya Object Veriable dır.
         */

        String std="Tom Hanks";//Instance variable
    static String stdName="Tom Hanks";//Class variable

    public int age=13;

    public static void staticmethod(){
        System.out.println("I'm static method");
    }
    public void nonStaticmethod(){
        System.out.println("I'm non-static method");
    }
}
