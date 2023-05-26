package concanitationOperatorsTypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        /**
         * Numeric primitive data typelarının(byte-short-int-long-float-double) birbirine dönüştürülmesine "Type Casting" denir.
         * Küçük data typelarını büyük data typelarına dönüştürmeyi java otomatik yapabilir-->AutoWidening
         * Büyük data typelarının küçük data typelarına dönüştürülmesini java otomatik yapmaz, kod yazanlar bunu manuel olarak yapar-->ExplicitNarrowing
         * Dönüşüm yapılan sayı dönüşeceği data typenınn sınırları dışında ise,
           java kullandığımız sayı ile mod işlemi yapar ve mod işleminin sonucu yeni değer olur, bu da dataların bozulmasına sebep olabilir, risklidir.
         */
        //byte daha typeını int data type ına çeviriniz--AutoWidening
        byte age=13;
        int ageInt=age;

        //int data typeını short data typeına çevirin-->ExplicitNarrowing
        int weight=313;
        short weightShort= (short) weight;//manuel olarak ()short yazdık, büyüğü küçüğün içine koyduğumuz için.

        double number=12.99;
        System.out.println(number);//12.99
        short numberShort= (short) number;
        System.out.println(numberShort);//12-->Java küsüratı siler double değilse
    }
}
