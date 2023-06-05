package loops;

import java.util.Scanner;

public class ForLoops03 {
    public static void main(String[] args) {
        //verilen stringin Palindrome olup olmadığını kontrol eden kodu yazın
        // nalan, ey edip adanada pide ye, 404
        String str = "ey edip adanada pide ye";
        String strTers = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strTers = strTers + str.charAt(i);
            //or strTers=strTers+str.substring(i,i+1);
        }
        if (str.equals(strTers)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Palindrome değil");
        }

        //5den 8e kadar tamsayıların toplamını veren kodu yazın
        int sum=0;
        for (int i=5; i<9; i++){
            sum=sum+i;
        }
        System.out.println(sum);

        //7den 9a kadar olan tamsayıların çarpımını veren kodu yazın
        int multiply=1;
        for (int i=7; i<10; i++){
            multiply=multiply*i;
        }
        System.out.println(multiply);

        //verilen tamsayının rakamları toplamını veren kodu yazın
        int sumDigits=0;
        int n=-578;
        n=Math.abs(n);
        for (int i=n; i>0; i=i/10){
            sumDigits=sumDigits+ i%10;
        }
        System.out.println(sumDigits);

        //kullanıcıdan baslangıc ve bitis değerlerini alın, aradaki tum çift tamsayıları ekrana yazdırın
        Scanner input=new Scanner(System.in);
        System.out.println("baslangıc değerini girin");
        int baslangıc=input.nextInt();
        System.out.println("bitiş değerini girin");
        int bitis=input.nextInt();
        if (baslangıc>bitis){
            System.out.println("baslangıc değeri bitis değerinden buyuk olmaz");
        }else{
            for (int i=baslangıc; i<=bitis; i++){
                if (i%2==0){
                    System.out.print(i+" ");
                }
            }
        }

    }
}
