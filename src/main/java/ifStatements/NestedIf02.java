package ifStatements;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
        //kulanıcıdan 3 uzunluk alıp üçgen çeşidini yazın
        Scanner input=new Scanner(System.in);
        System.out.println("3 uzunluk girin");
        double a=Math.abs(input.nextDouble());
        double b=Math.abs(input.nextDouble());
        double c=Math.abs(input.nextDouble());
        if (a==b&&a==c&&b==c){
            System.out.println("eskenar ucgen");
        }else if(a==b||a==c||b==c){
            System.out.println("ikizkenar ucgen");
        }else{
            System.out.println("cesitkenar ucgen");
        }

        //kullanıcıdan 0dan küçük 120den büyük olmayacak şekilde dtaları alın ve eğer kadınsa 60 yasından buyukse "emekli olabilir" yazdırın
        //erkekse 65den buyukse "emekli olabilir" yazdırın
        Scanner input2=new Scanner(System.in);
        System.out.println("Cinsiyetinizi girin");
        String gender=input2.next();
        System.out.println("yaşınızı girin");
        int age=input2.nextInt();

        if (age<0 || age>120){
            System.out.println("lutfen yaşı 0 ile 120 arasında girin");
        }else if (gender.equalsIgnoreCase("kadın")){
            if (age>60){
                System.out.println("emekli olabilir");
            }else{
                System.out.println("çalışmalı");
            }
        } else if (gender.equalsIgnoreCase("erkek")) {
            if (age>65){
                System.out.println("emekli olabilir");
            }else{
                System.out.println("çalışmalı");
            }
        }else{
            System.out.println("tanımlı değil");
        }
    }
}
