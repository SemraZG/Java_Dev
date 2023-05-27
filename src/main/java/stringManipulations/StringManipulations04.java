package stringManipulations;

public class StringManipulations04 {
    public static void main(String[] args) {

        //a,i,e nin ilk görünümlerinin indexlerini topla
        String r="Java is easy to learn";
        int indexA=r.indexOf("a");
        int indexI=r.indexOf('i');
        int indexE=r.indexOf('e');
        System.out.println(indexA+indexE+indexI);

        //Java kelimesinin ilk olarak kaçıncı indexde kullanıldığını gösterin
        String k="Ah Java vah Java, sensiz olmuyor Java.";
        int indexJava=k.indexOf("Java");
        System.out.println(indexJava);//3-->J'nin ilk görünümünün indexini verir.

        //a,i,e nin son görünümlerinin indexlerini topla
        String v="Java is easy to learn";
        int idxa=v.lastIndexOf("a");
        int idxe=v.lastIndexOf('e');
        int idxi=v.lastIndexOf('i');
        System.out.println(idxa+idxe+idxi);


        //abc@gmail.com--> sadece gmail i alın
        String a="abc@gmail.com";
        int startinIndex=a.indexOf("@")+1;
        int endingIndex=a.indexOf('.');
        String s=a.substring(startinIndex, endingIndex);
        System.out.println(s);

        //verilen iki stringin birbirine eşit olup olmadığını kontrol edin
        String c="Ali Can";
        String d="Ali Can";
        System.out.println(c.equals(d));//true

        /**Javada memory kullanımı
         * Javada iki memory var:
         * 1-Stack memory;
             Primitiveleri(char, boolean, byte..) ve non-primitivelerin(string, wrapperi bizim oluşturduğumuz classlar) adreslerini(reference) tutar.
         * 2-Heap memory;
             Non-primitive dataları içerir.

         Java heap memorye yerleştirilen tüm non-primitive datalar için bir adres oluşturur ve bu adresi stack memoryde saklar.
         Stringlerin aynı olup olmadığını kontrol ederken equal() methodu kullanırız, == kullanmayız.
         Çünkü == hem stringlerin adreslerinin hem değerlerinin eşitliği ararken, equals() methodu sadece değerlerin eşitliğini arar
         biz de genelde değerlerin eşit olup olmadığını iseriz bu yüzden equals() methodunu kullanırız.
         */

        //verilen iki stringin birbirine eşit olup olmadığını büyük küçük harf dikkate almadan kontrol edin
        String m="Ali Can";
        String n="ali can";
        System.out.println(m.equalsIgnoreCase(n));//true


    }
}
