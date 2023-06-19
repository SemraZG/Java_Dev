package stringBuilder;

public class StringBuilder01 {
    /**
     * StringBuilder classı string ureten bir classdır.
     * String classdan farkı ise mutable(değiştirilebilir) String uretır, String class immutable(değiştirilemez) string uretir.
     * Immutable olmak demek orjinal değerin değiştirilemez olması demektir.
     */
    public static void main(String[] args) {

//Immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        String a="Money";
        a=a+"More";
        /**burdaki gibi stringi değiştirdikten sonra aynı stringe assign ederesek jav ayine yeni bir container olusturur,
         çünkü string classdan olusturulan stringler immutableoldugu için o conteynırı değiştiremeyiz,
         değiştirilen string için java yeni bir container olusturur ve estack memoryde eski containerı gösteren pointer artık yeni containerı gösterir,
         ve bu durumda eski containerı gösteren stack memoryde pointer kalmayacagı için Garbage Colector adressiz olan bu eski container ı siler.
*/

//mutable
        //StringBuilder kullanarak string olusturmanın 1. yolu
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);//Python
        sb1.append("!");//append methodu concatenation (+) yapar
        System.out.println(sb1);//Python!

        //StringBuilder kullanarak string olusturmanın 2. yolu
        StringBuilder sb2=new StringBuilder();
        sb2.append("Java");

        //capacity() ile lenght methodu arasındaki fark:
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16
    }
}
