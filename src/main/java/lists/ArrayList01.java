package lists;

import java.util.*;

public class ArrayList01 {
    public static void main(String[] args) {

    /**
     * Aynı data typeındaki çoklu dataları depolamak için Array kullanırız ama arraylerde en başta eleman sayısını belirtmek zorunda olduğumuz için Arrayler çok kullanıllı değil.
     * Bu yüzden Java eleman sayısını belirtmek zorunda olmadığımız ArrayList==List yapısını olusturdu.
     * Arrayler Listlere göre daha hızlıdırlar ve daha az yer kaplarlar memoryde.
     * Arrayler primitive data typeları ve non-primitive lerin referancelarını depolarlar ama Listler non-primitive data typelarını depolarlar.
     *List<Integer> ages=new ArrayList<>();--> bu sekilde olusturulur, non-primiticeleri depoladığı için int değil de Integer kulllandık.
     * Listleri yazırmak için sout a listin adını yazmamız yeterli, arraylerde toString dememiz gerekiyordu.
     * Listlere eleman add methodu ile eklenir, elemanlar bizim verdiğimiz sıraya göre yani insertion order a göre eklenmiş olur, belirli indexe eklemek istersek de-->ages.add(1, 10)
     * Arraylere eleman eklerken indexi söylüyorduk-->ages[1]=9;
     * Listlere çoklu eleman eklemek istersek, önce eklemek istediğim elemanları baska bir liste atıyorum, bu listi ilk liste addAll ile ekliyorum.
     *
     * Arraylerde eleman sayısı length ile bulunurken listlerde eleman sayısı size() methodu ile bulunur.
     * Listte specific bir eleman nasıl değiştirilir?-->set() methodu ile istediğimiz indexe hangi elemanı koyacağımızı veririz-->ages.set(1, 111);//1.indexde ne varsa onun yerine 111 koy demek


     */
    ArrayList<Integer> ages=new ArrayList<>();
        System.out.println(ages);//[]
        ages.add(9);
        ages.add(3);
        ages.add(99);
        ages.add(100);
        ages.add(1, 10);
        System.out.println(ages);//[9, 10, 3, 99, 100]

        ArrayList<Integer> newages=new ArrayList<>();
        newages.add(0);
        newages.add(1);
        newages.add(2);

        ages.addAll(newages);
        System.out.println(ages);//[9, 10, 3, 99, 100, 0, 1, 2]
        ages.addAll(0, newages);//0. indexe ekledik
        System.out.println(ages);//[0, 1, 2, 9, 10, 3, 99, 100, 0, 1, 2]--> bir ustte de eklediğim için hem basta hem sonda oldu

        System.out.println(ages.size());//--> eleman sayısı

       //Listte specific bir eleman nasıl bulunur?-->get() methodu ile istediğimiz elemanın indexini veririz
        System.out.println(ages.get(1));

        //Listte specific bir eleman nasıl değiştirilir?-->set() methodu ile istediğimiz indexe hangi elemanı koyacağımızı veririz
        ages.set(1, 111);//1.indexde ne varsa onun yerine 111 koy demek
        System.out.println(ages);

        //Bir listteki tüm elemanları nasıl sileriz?
        ages.clear();
        System.out.println(ages);//[]

        //Bir listin boş olup olmadığını isEmpty() methodu ile kontrol edebiliriz

}
}
