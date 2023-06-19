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



     In Method Overloading, method name are not changed.
     In Method Overloading, parameters are changed.
     Parametreleri değiştirirken, parametrelerin data typeı, sayısı veya data trypeları farklı olan parametlerin yerleri değiştirilerek overloading yapılır.
     Method name + Method Pameters = Method Signature

     Overloading yapılırken return typeı değiştirmenin, access mod ı değiştirmenin, static veya non-static olmasının veya method body nin değiştirilmesinin bir önemi yoktur.

     Private methodlar overload edilebilir çünkü overloading tek bir classın içinde yapılır, private olmak baska classlara gidildiğinde problem olur.

     Static methodlar overload edilebilir.

     * Static variable veya static methodlar(class members) tüm objectler için ortak elemandır.
     * Static class memberlar uerinde yapılan tüm değişiklikler tum objectleri etkiler.
     * Static class memberlar Class'a, non-static memberlar objectlere monte edilir.
     * Mesela; bir classdan uz tane object urettiğimizde non-static olanlar da yuz kere olusturulur,
     ama static olanlar object sayıısndan bagımszı olarak bir kere olusturulurlar.
     * Static class memberlara ulasmak için o classdan object uretmeye gerek yoktur,
     ama non-static memberlara ulasmak için o classdan object uretmek zorundayız.
     * Static variabların diğer adı Class Variable dır,
     * Non-static variabların diğer adı Instance Variable veya Object Veriable dır.
     *
     * Student classdaki stdName variable ı static olduğu için o classdan obje uretmeden,
         (class ismi . variable ismi(Student.stdName)) ile runner classdan kullanmıs olduk.
         çünkü staticler classa montedir==>Student.stdName

    * Student classdaki age variable ı non-static olduğu için onu kullanabilmek için,
      önce student classdan obje olusturduk, sonra o obje uzerinden non-static variableri kullanabildik,
      çünkü non-staticler class a değil, o clasdan olusturulan objeye montedir==>student.age-->student, Student classdan olusturdugumuz obje.




     */

}
