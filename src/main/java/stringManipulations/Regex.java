package stringManipulations;

public class Regex {
    public static void main(String[] args) {
        /**
         * * Regex'ler:
         *      1-tüm rakamlar--> [0-9]
         *      2-tüm küçük harfler--> [a-z]
         *      3-tüm büyük harfler--> [A-Z]
         *      4-tüm küçük ve büyük harfler--> [a-zA-Z]
         *      5-tüm harfler ve rakamlar--> [a-zA-Z0-9]
         *      6-tüm noktalama işaretleri--> \\p{Punct}
         *      7-tüm sesli harfler--> [aeiouAEIOU]
         *      8-tüm x,q,w-->[xqw]
         *      9-küçük harflerden farklı tüm karakterler--> [^a-z]
         *      10-tüm harflerden hariç tüm karakterler--> [^a-zA-Z]
         *      11-sadece space karakteri--> \\s
         *      12-space karakteri hariç-->\\S
         *      13-sadece rakamlar-->\\d
         *      14-rakamlar hariç-->\\D

         */
        String s="Learn Java earn money";
        //"money" ile bitiyor mu
        System.out.println(s.endsWith("money"));//true
        //"money" kelimesini "dolar" ile değiştirin
        System.out.println(s.replace("money","dolar"));//Learn Java earn dolar
        //"earn" kelimesini "win" ile değiştirin
        System.out.println(s.replace("earn", "win"));//Lwin Java win money
        //tüm e harflerini silin
        System.out.println(s.replace("e", ""));

        String t="Ali 13 yasındadır!...";
        //tüm rakamları *'e çevirin-->replaceAll() methodu bir grup data ile işlem yapmak istersek kullanırız
        System.out.println(t.replaceAll("[0-9]", "*"));//Ali ** yaşındadır!...
        //tüm noktalama işaretleri yerine * koyun
        System.out.println(t.replaceAll("\\p{Punct}", "*"));//Ali 13 yaşındadır****

        //tüm rakamları ve harfleri !'e çevirin
        System.out.println(t.replaceAll("[a-zA-Z0-9]", "!"));

        //tüm sesli harfleri soru işaretine çevirin
        System.out.println(t.replaceAll("[aeiouAEIOU]", "?"));//Al? 13 y?sınd?dır!...

        //küçük harfler dışındaki tüm karakterleri "<>"'ne çevirin
        System.out.println(t.replaceAll("[^a-z]", "<>"));

        //spaceler dışındaki tüm karakterlere ? koyun
        System.out.println(t.replaceAll("[^ ]", "?"));//??? ?? ??????????????

        //spaceleri kaldırın
        System.out.println(t.replaceAll("[ ]", ""));//Ali13yasındadır!...


        //


    }
}
