package ternaryAndswitch;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        //sayı 10dan kucukse "kucuk "yazdırın, değilse "kucuk degğil" yazdırın

        int num=3;
        String result=num<10 ? "kucuk" : "buyuk";
        System.out.println(result);

        //sayı çift ise "çift", tek ise "tek" yazdırın
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı girin");
        int digit=input.nextInt();
        String result2= digit%2==0 ? "Çift" : "Tek";
        System.out.println(result2);

        //kullanıcıdan 2 sayı alın, buyuk olmayan sayıyı yazdırın
        Scanner input2=new Scanner(System.in);
        System.out.println("iki sayı girin");
        double num1=input2.nextDouble();
        double num2=input2.nextDouble();
        double result3= num1<num2 ? num1 : num2;
        System.out.println(result3);
    }
}
