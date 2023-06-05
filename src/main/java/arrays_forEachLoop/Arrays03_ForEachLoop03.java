package arrays_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03_ForEachLoop03 {
    public static void main(String[] args) {
       //verilen arrayde kaç tane çift kaç tane tek sayı olduğunu bulan kodu yazın
       int arr[]={63,19,313,353,7,100,4};
        System.out.println(Arrays.toString(arr));
        int cift=0;
        int tek=0;
        for (int w: arr){
            if (w%2==0){
                cift++;
            }else{
                tek++;
            }
        }
        System.out.println("cift = " + cift);
        System.out.println("tek = " + tek);
        //2.yol
        System.out.println("tek= "+(arr.length-cift));//burada tek sayılar için counter olusturmaya gerek yok, eleman sayısında çift sayıları çıkarırsak tek sayılar kalır.


        //verilen String arraydeki isimlerden 5 karakterden az olanları yazdırın
        String brr[]={"Semra", "Ali", "Sema", "Banu", "Mehmet"};
        for (String w: brr){
           if (w.length()<5){
               System.out.print(w+" ");
           }
        }
        System.out.println();



        //verilen string arraydeki isimleri alfabetik sıraya koyun ce F ile baslayanlar hariç yazdırın
        String srr[]={"Semra", "Ali", "Sema", "Banu", "Mehmet", "Fatma", "Ferdi"};
        Arrays.sort(srr);
        for (String w: srr){
            if (w.startsWith("F")){            //or--->if (!w.startsWith("F")){System.out.print(w+" ");}
                continue;
            }else{
                System.out.print(w+" ");
            }
        }
        System.out.println();



        //kullanıcının çoklu datayı bir arraye yerleştirmesi ve istediği zaman da durdurabilmesi için gerekli kodu yazın
        Scanner input=new Scanner(System.in);
        System.out.println("Eklemek istediğiniz öğrenci sayıısnı giriniz");
        int numOfStudents=input.nextInt();
        String stdNames[]=new String[numOfStudents];
        System.out.println("Işlemi durdurmak için q'ya basınız");
        for (int i=0; i<stdNames.length; i++){//index ile çalışacağımız için for loop kullandık, for each direk arraydeki elemanın kendisini aldığı için onu kullanmadık
            System.out.println((i+1)+". öğrencinin ismini giriniz");
            String name=input.next();
            if (name.equalsIgnoreCase("q")){
                break;
            }else{
                stdNames[i]=name;
            }
        }
        System.out.println(Arrays.toString(stdNames));



    }
}
