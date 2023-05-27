package stringManipulations;

public class StringManipulations03{
    public static void main(String[] args) {
        /**
         * trim methodu baştaki ve sondaki spaceleri siler
         * indexOf(x) methodu x'in ilk görünümünün indexini verir, olmayan karakterler için -1 return eder.
         * split() methodu stringi ayırmaya yarar.
         *
         */

        //"  Ali Can  "--> baştaki ve sondaki spaceleri silin
        String s="  Ali Can  ";
        System.out.println(s.trim());//Ali Can

        //Aşağıdaki ürünlerin toplam fiyatını bulun
        String tv="$456.99";
        String pc="$87.99";
        String tv2=tv.replace("$", "");
        String pc2=pc.replace("$", "");
        double tv3=Double.valueOf(tv2);
        double pc3=Double.valueOf(pc2);
        System.out.println(tv3+pc3);//544.98

        //Verilen ismin ilk harfini ve soyismin ilk harfini yazdırın
        String name= "  Ali Can ";

        char first=name.trim().toUpperCase().charAt(0);
        char last=name.trim().toUpperCase().split(" ")[1].charAt(0);
        //split() methodu ile nerden böleceğimizi söylüyoruz, sonra böldüğümüz hangi indexin içindeki indexi kullanicaz bunu söylüyoruz, [1]--demek böldükten sonraki 1.index demek
        System.out.println(first+last);//bu şekilde ascii değerlerin toplamını veriyordu
        System.out.println(""+first+last);//AC

        //stringde hiç karakter olmadığını yani boş bir string olduğunu kontrol edin
        String a="";
        System.out.println(a.length()==0);//true
        //2.yol
        System.out.println(a.isEmpty());//true

        //stringin space hariç başka karakter içermediğini kontrol edin
        System.out.println(a.replace(" ", "").length()==0);//ture
        //2.yol
        System.out.println(a.isBlank());//true


    }
}
