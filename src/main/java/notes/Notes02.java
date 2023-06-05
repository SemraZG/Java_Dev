package notes;

public class Notes02 {
    /**Javada memory kullanımı
     * Javada iki memory var:
     * 1-Stack memory;
     Primitiveleri(char, boolean, byte..) ve non-primitivelerin(string, wrapperi bizim oluşturduğumuz classlar) adreslerini(reference) tutar.
     * 2-Heap memory;
     Non-primitive dataları içerir.

     Java heap memorye yerleştirilen tüm non-primitive datalar için bir adres oluşturur ve bu adresi stack memoryde saklar.
     Stringlerin aynı olup olmadığını kontrol ederken equal() methodu kullanırız, "==" kullanmayız.
     Çünkü "==" hem stringlerin adreslerinin hem değerlerinin eşitliği ararken, equals() methodu sadece değerlerin eşitliğini arar
     biz de genelde değerlerin eşit olup olmadığını iseriz bu yüzden equals() methodunu kullanırız.

     Object class javada non-primitive data typların ortak parentıdır.
     Farklı dta typeların için ortak bir variable oluşturmak istediğimizde data type olarak Object i kullanırız.

     Aynı data typeında olan birden fazla datayı depolayabilmek için Java Array yapısını oluşturmustur.
     Arrayler diğer collectionlardan daha hızlıdır ve daha az memory kullanırlar.
     for-each loop Arraylerde ve diğer collectionlarda kullanılır sadece-->
     for each loop-->for(String w: arr){}-->forEachLoopda index yok, int idx=0; yazarak kendimiz oluşturuyoruz, w elemanın kendisi demek.

     Arrayler konsola yazıdırlırlen Arrays.toString() ile yazdırılırken, multidimensional Arrayler, Arrays.deeptoString() ile yazdırılır.
     multidimensional Arraylerin data type ı Arraydir--->    for (String [] w: arr){}
     for (String [] w: students){
        for (String k: w){
     }                       ======> w=> students multidimensional Arraydeki her bir Array demek,
                            ======> k=> students w Arrayinin içindeki her bir eleman demek,


     Arrays.short() methodu Arraysdeki elemanları Natural Order a göre sıralar.

     Math.min(a,b);-->a ile b'den kucuk olanı verir.
     Math.max(ma,b);-->a ile b'den buyuk olanı verir.
     Math.abs(a);-->a'nın mutlak değerini verir.

     */

}
