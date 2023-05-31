package ternaryAndswitch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        String day="Tuesday";
        switch (day.toLowerCase()){
            case "sunday" :
                System.out.println(1);
                break;
            case "monday" :
                System.out.println(2);
                break;
            case "tuesday" :
                System.out.println(3);
                break;
            case "wednesday" :
                System.out.println(4);
                break;
            case "thursday" :
                System.out.println(5);
                break;
            case "friday" :
                System.out.println(6);
                break;
            case "saturday" :
                System.out.println(7);
                break;
            default:
                System.out.println("geçerli gün ismi giriniz");
        }


        //ay numarası verilince verilen aydan baslayıp 12. aya kadar tum ayların isimlerini yazdırın
        Scanner input=new Scanner(System.in);
        System.out.println("başlangıç ayını giriniz");
        int month=input.nextInt();
        switch (month){
            case 1 :
                System.out.println("ocak");
            case 2 :
                System.out.println("subat");
            case 3 :
                System.out.println("mart");
            case 4 :
                System.out.println("nisan");
            case 5 :
                System.out.println("mayıs");
            case 6 :
                System.out.println("hazıran");
            case 7 :
                System.out.println("temmuz");
            case 8 :
                System.out.println("agustos");
            case 9 :
                System.out.println("eylul");
            case 10 :
                System.out.println("ekim");
            case 11 :
                System.out.println("kasım");
            case 12 :
                System.out.println("aralık");
                break;//buraya break koymazsak "gecerli ay numarası giriniz" kısmını da yazdırır
            default:
                System.out.println("geçerli ay numarası giriniz");
        }

    }
}
