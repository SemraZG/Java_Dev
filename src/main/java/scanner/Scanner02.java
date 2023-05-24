package scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Example 1--> kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu alın
//        a)Alanını hesaplayın--kısa kenar*uzun kenar
//        b)Çevresini hesaplayın--2*kısa kenar +2*uzun kenar

        Scanner input=new Scanner(System.in);
        System.out.println("Kısa kenarı girin");
        double kısakenar=input.nextDouble();
        System.out.println("Uzun kenarı girin");
        double uzunkenar=input.nextDouble();
        System.out.println(kısakenar*uzunkenar);
        System.out.println(2*kısakenar+2*uzunkenar);


        //Example 2--> Kullanıcıdan alacağınız 5 basamaklı bir sayının ilk iki ve son iki rakamların toplamını yazdıran kodu yazın.
        Scanner input2=new Scanner(System.in);
        System.out.println("beş basamaklı bir sayı girin");
        int number=input2.nextInt();
        // % modulus operator solunda bulunan sayının sağında bulunan sayıya bölümünden kalanı verir.
        // 38671 % 10 = 6
        // 38671 / 10= 3867  --normalde 3867.1 ama java küsüratı direk siler tamsayı olarak verir.
        int birlerBasamağı=number%10;
        //sayıyı küçült
        number = number/10;
        int onlarBasamağı=number%10;
        number= number/10;
        int yüzlerbasamağı=number%10;
        number=number/10;
        int binlerBasamağı=number%10;
        number=number/10;
        int onbinlerBasamağı=number%10;
        number=number/10;

        System.out.println(onbinlerBasamağı+binlerBasamağı+birlerBasamağı);


        //Example 3--> kullanıcıdan aldığınız 3 sayının ortalasını bulan kodu yazın
        Scanner input3=new Scanner(System.in);
        System.out.println("3 tane sayı giriniz");
        int digit1=input3.nextInt();
        int digit2=input3.nextInt();
        int digit3=input3.nextInt();
        System.out.println((digit1+digit2+digit3)/3);


    }
}
