package ifStatements;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        //sayı 3 basamaklı ise ekrana "sayı üç basamaklıdır" yazdırın
        int num=123;
        if (num>99 && num<1000){
            System.out.println("sayı üç basamaklıdır");
        }

        int numNegatif=-123;
        numNegatif=Math.abs(numNegatif);//javanın Math classındaki abs() methodu sayesinde negatif sayıların mutlak değerini alabiliriz->yani pozitife çeviriyoruz.
        if (numNegatif>99 && numNegatif<1000){
            System.out.println("negatif sayılar da üç basamaklı olabilir");
        }

        //Kullanıcıdan alınan sayının tek mi çift mi olduğunu yazdıran kodu yazın
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a digit");
        int digit=input.nextInt();
        if (digit%2==0){
            System.out.println("Çift sayı");
        }else{
            System.out.println("tek sayı");
        }

        //Kullanıcıdan alınan karakter büyük mü küçük mü yazdırın
        Scanner input2=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=input2.next().charAt(0);
        if (ch>='A'&& ch<='Z'){
            System.out.println("UpperCase");
        }else if(ch>='a'&&ch<='z'){
            System.out.println("LowerCase");
        }else{
            System.out.println("Enter a valid character");
        }



    }
}
