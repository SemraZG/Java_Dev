package arrays_forEachLoop;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {
        int a[][]=new int [3][2];
        a[0][0]=5;
        a[0][1]=45;
        a[1][0]=3;
        a[1][1]=89;
        a[2][0]=56;
        a[2][1]=99;

        System.out.println(Arrays.deepToString(a));//[[5, 45], [3, 89], [56, 99]]
        System.out.println(Arrays.toString(a[0]));//[5, 45]
        System.out.println(a[0][1]);//45

        String students[][]={{"Semra", "Esin"}, {"Yusuf","Rabia", "Betul"}, {"Ali"}, {"Esra","Muhammed"}};
        //students in içinde kaç isim var bulunuz
        int sum=0;
        for (String [] w: students){
            sum=sum+w.length;
        }
        System.out.println(sum);

        //studentsda içinde s olan isimleri yazıdırn
        for (String [] w: students){
            for (String k: w){
                if (k.contains("s"))
                    System.out.print(k+" ");//Esin Yusuf Esra
            }
        }

        //int multidimensional arraydeki tüm elemanların çarpın
        int brr[][]={{12,36},{8},{1,2,3}};
        int multiply=1;
        for (int [] w: brr){
            for (int k: w){
                multiply=multiply*k;
            }
        }
        System.out.println(multiply);

    }
}
