package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List02 {
    public static void main(String[] args) {
        //bir listin baska bir list ile aynı olup olmadığını kontrol edin

        ArrayList<String> names1=new ArrayList<>();
        names1.add("Tom");
        names1.add("Mark");
        names1.add("Tony");

        ArrayList<String> names2=new ArrayList<>();
        names2.add("Tom");
        names2.add("Tony");
        names2.add("Mark");

        boolean s=names1.equals(names2);
        System.out.println(s);//false verir çünkü listlerin aynı olması için aynı indexlerde aynı elemanları olması lazım.

        //verilen 2 Integer listte aynı elemanları olup olmadoığını kontrol edin
        ArrayList<Integer> nums1=new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);

        ArrayList<Integer> nums2=new ArrayList<>();
        nums2.add(2);
        nums2.add(3);
        nums2.add(1);

        Collections.sort(nums1);//list de bir collection olduğu için sort() methodunu collectiondan çağrdık, arraylerde Arrays.sort ile sıralamıstık.
        Collections.sort(nums2);
        System.out.println(nums1.equals(nums2));

        //listte bir elemanın ilk görünümü nasıl silinir
        ArrayList<String> cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("New York");
        cities.add("Manisa");
        cities.add("Mardin");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Ankara");
        cities.add("Paris");

        System.out.println(cities);//[Miami, Istanbul, New York, Manisa, Mardin, Istanbul, Istanbul, Ankara, Paris]
        cities.remove("Istanbul");//remove() methodu elemanın ilk görünümünü siler
        System.out.println(cities);//[Miami, New York, Manisa, Mardin, Istanbul, Istanbul, Ankara, Paris]


        ////bir listteki belrli elemanın tüm görünümlerini nasıl sileriz
        List<String> citiesToRemove=new ArrayList<>();
        citiesToRemove.add("Ankara");
        citiesToRemove.add("Istanbul");
        citiesToRemove.add("Mardin");

        cities.removeAll(citiesToRemove);
        System.out.println(cities);//[Miami, New York, Manisa, Paris]-->elemandan birden fazla varsa hepsini siler

        //verilen Integer listte eleman silme
        ArrayList<Integer> nums3=new ArrayList<>();
        nums3.add(1);
        nums3.add(2);
        nums3.add(3);
        nums3.add(30);
        nums3.add(333);

        nums3.remove(3);//böyle yazarsak java 3.index olarak algılar
        System.out.println(nums3);//[1, 2, 3, 333]
        nums3.remove((Integer) 3);//böyle yazarsak eleman olan Integer 3ü sil demiş oluruz
        System.out.println(nums3);//[1, 2, 333]
        //or
        nums3.remove(Integer.valueOf(2));//2nin Integer değerini sil demiş olduk
        System.out.println(nums3);//[1, 333]
        //or
        nums3.remove(nums3.indexOf(333));//333ün olduğu indexi sil demiş olduk
        System.out.println(nums3);//[1]

    }
}
