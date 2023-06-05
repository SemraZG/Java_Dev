package arrays_forEachLoop;

import java.util.Arrays;

public class Arrays04_ForEachLoop04 {
    public static void main(String[] args) {
        //specific bir elamanın Arrayde olup olmadığını kontrol eden kodu yazın
        String names[]= {"k", "C", "R", "A", "S"};
        String specific="a";
        int counter=0;
        for (String w: names){
            if (w.equals(specific)){
                counter++;
                break;
            }
        }
        if (counter>0){
            System.out.println(specific+ " Arrayde var");
        }else{
            System.out.println(specific+ " Arrayde yok");
        }

        //2.yol   -->binarySearch() methodunu kullanmak için once Arrays.sort() methodunu kullanmalıyız.
        //        -->var olan elemanlar için o elemanın indexini verir, eleman arrayde yoksa negatif tamsayı değeri verir.
        Arrays.sort(names);
        int result=Arrays.binarySearch(names, specific);
        System.out.println(result);//2-->R var ve indexi 2 demek, mesela -2 verseydi o eleman arrayde yok ve olsaydı eğer 2. eleman olcaktı demek.





        //verilen cümlede kaç kelime olduğunu gösteren kodu yazın
        String s="Java is easy. Learn Java earn money.";
        String arr[]=s.split(" ");
        System.out.println(Arrays.toString(arr));//[Java, is, easy., Learn, Java, earn, money.]
        System.out.println(arr.length);//7

        //yukarıdaki stringde kaç harf olduğunu gösteren kodu yazın
        String brr[]=s.replaceAll("[^a-zA-Z]", "").split("");
        System.out.println(Arrays.toString(brr));//[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]
        System.out.println(brr.length);





        //[0,2,3,0,12,0]sıfırları en sona koyunuz-->[2,3,12,0,0,0]
        int num[]={0,2,3,0,12,0};
        int num2[]=new int[num.length];
        System.out.println(Arrays.toString(num2));//[0, 0, 0, 0, 0, 0]
        int idx=0;
        for (int w: num){
            if (w!=0){
                num2[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(num2));//[2, 3, 12, 0, 0, 0]





    }


 }







