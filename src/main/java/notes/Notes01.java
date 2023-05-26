package notes;

public class Notes01 {
    /**
     * Javada method nasıl oluşturulur?
     1-main methodun dışında ama class ın içinde oluşturulur.
     2-Access Modifier + return type + method ismi + () + {method body}

     *Oluşturulan methodlar nasıl kullanılır?
     Kullanılmak istenen method main methodun içinde çağrılarak kullanılır-->method ismi yazılıp, "()" konulur.

     ** main method static olduğu için, main methodun içinden çağıracağımız method da static olmalıdır.

     method name + parametreler = method signature

     * Eğer bir method yeni birşey üretmiyorsa sadece ekrana yazdırmak gibi,return type i void olur,
     return type void olduğu için de return keyword yazılmaz.

     * Her class bir kalıptır, bu kalıptan pasif(variable) ve aktif(method) özellikleri olan object ler üretiyoruz.

     * Object nasıl oluşturulur?
         Class ismi + Object ismi + = + new keyword + Constructor
         Car              myCar     =   new           Car();
         Car myCar=new Car();

     * Scanner classdan (kullanıcıdan data alırken kullandığımız javanın hazır classı),
        next() methodu kullanıcıdan tek kelimeli string almak için kullanılır.
        nextLine() methodu kullanıcıdan çok kelimeli string almak için kullanılır.

     * primitive-->    char-boolean-byte-short-int-long-float-double
     * Wrapper Class-->Character-Boolean-Byte-Short-Integer-Long-Float-Double
          Wrapper classlar non-primitividir bu yüzden memoryde çok yer kaplarlar
          dolayısıyla şart değilse wrapper class kullanmayı tercih etmeyiz.
          wrapper classlar non-primitive olduğu için aktif özellik yani method içerirler,
          primitiveler method içermez.
     * Primitive datanın wrapper class a çevrilmesi-->AutoBoxing
       Wrapper classın primitive dataya çevrilmesi-->UnBoxing

     *Numeric primitive data typelarının(byte-short-int-long-float-double) birbirine dönüştürülmesine "Type Casting" denir.
          Küçük data typelarını büyük data typelarına dönüştürmeyi java otomatik yapabilir-->"AutoWidening"
          Büyük data typelarının küçük data typelarına dönüştürülmesini java otomatik yapmaz, kod yazanlar bunu manuel olarak yapar-->"ExplicitNarrowing"
     Dönüşüm yapılan sayı dönüşeceği data typenınn sınırları dışında ise,
     java kullandığımız sayı ile mod işlemi yapar ve mod işleminin sonucu yeni değer olur, bu da dataların bozulmasına sebep olabilir, risklidir.

     *  AutoBoxing ve UnBoxingde aynı tür datalar aasında dönüşüm var, sadece wrapper a veya wrapperdan dönüştürüyoruz,
        AutoWideningde ve ExplicitNarrowing ise numeric data typeları arasında dönüşüm yapıyoruz.

     * Regex'ler:
     1-tüm rakamlar--> [0-9]
     2-tüm küçük harfler--> [a-z]
     3-tüm büyük harfler--> [A-Z]
     4-tüm küçük ve büyük harfler--> [a-zA-Z]
     5-tüm harfler ve rakamlar--> [a-zA-Z0-9]
     6-tüm noktalama işaretleri--> \\p{Punct}
     7-tüm sesli harfler--> [aeiouAEIOU]
     8-tüm x,q,w-->[xqw]
     9-küçük harflerden farklı tüm karakterler--> [^a-z]
     10-tüm harflerden hariç tüm karakterler--> [^a-zA-Z]
     11-sadece space karakteri--> \\s
     12-space karakteri hariç-->\\S
     13-sadece rakamlar-->\\d
     14-rakamlar hariç-->\\D

     Regex'ler genelde replaceAll() methodu ile kullanılır.

     */
}
