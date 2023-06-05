package arrays_forEachLoop;

import java.util.Arrays;

public class Arrays01_ForEachLoop01 {
    public static void main(String[] args) {
        /*
       aynı data typeında olan birden fazla datayı depolayabilmek için Java Array yapısını oluşturmustur.
       Arrayler diğer collectionlardan daha hızlıdır ve daha az memory kullanırlar.
       for-each loop Arraylerde ve diğer collectionlarda kullanılır sadece.
        */
        String arrayName [] = new String [5];
        System.out.println(arrayName);//[Ljava.lang.String;@6d03e736
        //arrayleri java heap memoryde tutar, ama orası çok buyuk olduğu için yazdırmak istediğimizde heapdeki olusturdugumuz arrayin stack memorydeki referans değerini yazdırı.
        System.out.println(Arrays.toString(arrayName));//[null, null, null, null, null]
        //Arrays.toString() ile yazdırırsak direk heapdeki değerini yazdırır, referance(adres) değerini değil.

        //Array e nasıl eleman ekleme yapılır
        arrayName[2]="Semra";
        arrayName[3]="Ali";
        System.out.println(Arrays.toString(arrayName));//[null, null, Semra, Ali, null]
        arrayName[0]="Seher";
        arrayName[4]="Yusuf";
        arrayName[1]="Selma";

        //Arrayden specific bir elemanı nasıl alırız
        System.out.println(arrayName[3]);//Ali

        //Arraydeki her elemanın sonuna ! koyunuz
        for (int i=0; i<arrayName.length; i++){
            System.out.println(arrayName[i]+"!");
        }

        //ilk eleman ile son elemanın içerdiği karakter sayıları toplamını yazdırın
        System.out.println(arrayName[0].length()+arrayName[arrayName.length-1].length());

        //tüm elemanların içerdiği karakter sayısnı yazdırın
        int i=0;
        int total=0;
        while (i< arrayName.length){
            total=total+arrayName[i].length();
            i++;
        }
        System.out.println(total);

        //2.yol--> for-each loop---> for-each loop Arraylerde ve diğer collectionlarda kullanılır sadece.

        int sum=0;
        for (String w: arrayName){// w--> arrayName isimli arraydeki her bir eleman demek
           sum=sum+ w.length();
        }
        System.out.println(sum);

    }
}
