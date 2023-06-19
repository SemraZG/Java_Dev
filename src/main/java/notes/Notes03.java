package notes;

public class Notes03 {
    /**
     Sometimes before psvm are run, variables should be ready. Because of thar we use static blocks.
     if static variables are initialized in static block, they are ready in that class before everything.


     Constructor--> classdan object üretmemize yarayan code bloklarıdır
     *     Biz constructor olusturmazsak Java otomatik default constructor olusturur, ne zaman ki biz contructor olustururuz o zaman java kendi default contructrını siler.
     *     Constructor nasıl olusturulur?
     *     Access mosifier + Class ismi + () + {}

     *     Method ile constructor arasındaki farklar nedir?
     *     1-Methodda return type olur, consturcturda olmaz
     *     2-Method ismini biz veririz isteğimize göre, contructrun ismi class ismi ile aynı olmak zorunda.
     *     3-Method bir aksiyon yapmak için olusturulur, constructor ise object olusturmak içindir.



     *     Aynı data typeındaki çoklu dataları depolamak için Array kullanırız ama arraylerde en başta eleman sayısını belirtmek zorunda olduğumuz için Arrayler çok kullanıllı değil.
     *     Bu yüzden Java eleman sayısını belirtmek zorunda olmadığımız ArrayList==List yapısını olusturdu.
     *
     *     Arrayler Listlere göre daha hızlıdırlar ve daha az yer kaplarlar memoryde.
     *     Arrayler primitive data typeları ve non-primitive lerin referancelarını depolarlar ama Listler non-primitive data typelarını depolarlar.
     *     List<Integer> ages=new ArrayList<>();--> bu sekilde olusturulur, non-primiticeleri depoladığı için int değil de Integer kulllandık.
     *     Arraylist oluştururken sağ tarafa ArrayList yazmak zorundayız ama ilk tarfa sadece List de yazabiliriz.
     *     Listleri yazırmak için sout a listin adını yazmamız yeterli, arraylerde toString dememiz gerekiyordu.
     *     Listlere eleman add methodu ile eklenir, elemanlar bizim verdiğimiz sıraya göre yani insertion order a göre eklenmiş olur, belirli indexe eklemek istersek de-->ages.add(1, 10)
     *     Arraylere eleman eklerken indexi söylüyorduk-->ages[1]=9;
     *     Listlere çoklu eleman eklemek istersek, önce eklemek istediğim elemanları baska bir liste atıyorum, bu listi ilk liste addAll ile ekliyorum.
     *
     *     Arraylerde eleman sayısı length ile bulunurken listlerde eleman sayısı size() methodu ile bulunur.
     *     Listte specific bir eleman nasıl değiştirilir?-->set() methodu ile istediğimiz indexe hangi elemanı koyacağımızı veririz-->ages.set(1, 111);//1.indexde ne varsa onun yerine 111 koy demek



     1-public
     2-protected (inheritance yoksa baska packagelardan kullanılamaz)
     3-default==package private(hicbirsey yazmazsak default olur, aynı packagelardan kullanılabilir)
     4-private

     public > protected > default > private



     * Thanks to Interitance;
     we get rid of code duplication,
     maintenance is easy,
     child classes are more atomic.

     Child class objects can use method and variables in parent class but parent class can not use method and variables in child class.
     In Java there is no multiple inheritance, Java supports Single Inheritance.

     */
}
