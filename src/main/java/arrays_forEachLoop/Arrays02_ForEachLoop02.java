package arrays_forEachLoop;

import java.util.Arrays;
import java.util.Map;

public class Arrays02_ForEachLoop02 {
    public static void main(String[] args) {
        //notlar adında 6 elemanlı integer array olusturun ve not ortalamasını yazdırın
        int notlar []=new int[6]; //veya int notlar []= {50,10,40,90,60,80}
        notlar[0]=50;
        notlar[1]=10;
        notlar[2]=40;
        notlar[3]=90;
        notlar[4]=60;
        notlar[5]=80;

        int sum=0;
        for (int w: notlar){
            sum=sum+w;
        }
        System.out.println(sum/ notlar.length);

        //arraydeki en kucuk ve en buyuk elemanın toplamını yazdırın
        //1.yol
        System.out.println(Arrays.toString(notlar));//[50, 10, 40, 90, 60, 80]
        Arrays.sort(notlar);
        System.out.println(Arrays.toString(notlar));//[10, 40, 50, 60, 80, 90]
        System.out.println(notlar[0]+notlar[notlar.length-1]);//100

        //2.yol
        int min=notlar[0];
        int max=notlar[0];
        for (int w: notlar){
           min= Math.min(min, w);
           max=Math.max(max, w);
        }
        System.out.println(min);//10
        System.out.println(max);//90
        System.out.println(min+max);//100

        //6 elemanlı string array olusturun
        String arrayName[]=new String[6];
        arrayName[2]="Semra";
        arrayName[3]="Ali";
        arrayName[0]="Seher";
        arrayName[4]="Yusuf";
        arrayName[1]="Selma";
        arrayName[5]="Ahmet";

        //Aliden önceki elemanları yazdırın
        for (String w: arrayName){
            if (w.equals("Ali")){
                break;
            }
            System.out.print(w+" ");//Seher Selma Semra
        }
        System.out.println();

        //Ali ve sonraki elemanları ayzdırın
        for (String w: arrayName){
            System.out.print(w+" ");//Seher Selma Semra Ali
            if (w.equals("Ali")){
                break;
            }
        }
    }
}
