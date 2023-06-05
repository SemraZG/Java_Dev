package arrays_forEachLoop;

import java.util.Arrays;

public class MultiDimensionalArray02 {
    public static void main(String[] args) {

        int brr[][]={{12,36},{8},{1,2,3}};
        //yukarıdaki Arrayi tek boyutlu Array e çevirin--->{{12,36},{8},{1,2,3}}==>[12, 36, 8, 1, 2, 3]
        int toplamElemanSayısı=0;
        for (int [] w: brr){
            toplamElemanSayısı=toplamElemanSayısı+w.length;
        }
        int brr2[]=new int[toplamElemanSayısı];
        int idx=0;
        for (int [] w: brr){
            for (int k: w){
                brr2[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr2));//[12, 36, 8, 1, 2, 3]

        //brr multidimensional arraydeki en kucuk ve en buyuk elemanları bulun
        int ages[][]={{12,36},{8},{1,23,39}};
        int small=ages[0][0];
        int old=ages[0][0];
        for (int [] w: ages){
            for (int k: w){
               small= Math.min(small, k);
               old=Math.max(old, k);
            }
        }
        System.out.println(small);//1
        System.out.println(old);//39

    }
}
