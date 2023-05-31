package ternaryAndswitch;

import java.util.Scanner;

public class SwitchHesapMakinası {
    public static void main(String[] args) {
        //kullanıcıdan 2 sayı ve yapılacak işlemi alın ve +,-,*,/ işlemlerini yapan kodu yazın
        Scanner input=new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        System.out.println(" yapılacak işlemi seçin: +,-,*,/");
        char opr=input.next().charAt(0);
        switch (opr){
            case '+' :
                System.out.println(num1+num2);
                break;
            case '-' :
                System.out.println(num1-num2);
            case '*' :
                System.out.println(num1*num2);
                break;
            case '/' :
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("geçerli bir işlem seçin");
        }

    }
}
