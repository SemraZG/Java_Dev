package concanitationOperatorsTypeCasting;

public class Concanitation {
    public static void main(String[] args) {
        String s="elma";
        int a=10;
        int b=11;
        System.out.println(s+a+b);//elma1011
        System.out.println(s+(a+b));//elma21
        System.out.println(s+a*b);//elma110
        System.out.println(a+b+s);//21elma
        System.out.println(a+s+b);//10elma11

        //Javada "+" sembolü iki string arasında kullanılırsa concanitaion (birleştirme) işlevi görür.

        //String olarak verilen iki fiyatı toplayın.
        String shirt="2300";
        String shoes="5200";
        System.out.println(shirt+shoes);//23005200

        //Integer.valueOf()-->string değerleri integer a çevirir.
        int toplamFiyat=Integer.valueOf(shoes)+Integer.valueOf(shirt);
        System.out.println(toplamFiyat);//7500

        //String olarak verilen iki fiyatı toplayın.
        String tv="$1100";
        String radio="$300";

        //Note: valueOf() methodu tüm karakterleri rakam olan Stringleri sayılara çevirir.
        //Integer.valueOf(tv)+Integer.valueOf(radio);


    }
}
