package notes;

public class Notes02 {
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

}
