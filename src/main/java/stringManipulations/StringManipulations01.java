package stringManipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String non-primitive data typedır ve aynı zamanda bir classdır.
        String s="Java is easy";
        //tüm karakterleri büyük harf yapın
        String sUpper= s.toUpperCase();
        System.out.println(s);//Java is easy
        System.out.println(sUpper);//JAVA İS EASY
        System.out.println(s.toLowerCase());//java is easy

        //ilk karakteri alın
        System.out.println(s.charAt(0));//J
        //toplam karakter sayısını bulun
        System.out.println(s.length());//1

        //ikinci ve sondan ikinci karakteri alın
        System.out.println(s.charAt(1)+s.charAt(s.length()-2));//212-->char değerler olduğu için ascii değerini verir bu şekilde.
        System.out.println(""+s.charAt(1)+s.charAt(s.length()-2));//as

        //ilk 4 karakteri alın-->substring methodunda ilk taraf dahil ikinci taraf hariç
        //substring(0,4)-->.index dahil 4.index'e kadar al,4.index hari
        System.out.println(s.substring(0,4));

        //"is" hecesini alınız
        System.out.println(s.substring(5,7));

        //"easy" kelimesini alın
        System.out.println(s.substring(8));//eğer tek index yazarsam o indexden başlar ve sonuna kadar yazar

        //"money" var mı yok  mu
        System.out.println(s.contains("money"));//false

        //"Java" ile mi başlıyor
        System.out.println(s.startsWith("Java"));//true

        //
    }
}
