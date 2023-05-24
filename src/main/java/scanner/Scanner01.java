package scanner;

import java.util.Scanner;//javanın util kütüphanesinden scanner class import edildi.

public class Scanner01 {
    public static void main(String[] args) {
//        //1. adım--> Scanner classdan object oluştur,
//        Scanner input= new Scanner(System.in);
//        //2. adım--> kullanıcıya ne istediğinize dair mesaj verin,
//        System.out.println("Yaş giriniz");
//        //3. adım--> uygun methodu kullanarak kullanıcının verdiği datayı memory e yerleştirin.
//        byte age=input.nextByte();
//        System.out.println("age = " + age);
//
//        //Example 1--> Kullanıcıdan ilk ismini ve soyismini alıp aynı satırda yazdırın.
//        Scanner input2= new Scanner(System.in);
//        System.out.println("İlk ismizini giriniz");
//        String firstName=input2.next();
//        System.out.println("Soyisminizi giriniz");
//        String lastName= input2.next();
//        System.out.println(firstName+" "+lastName);
//        //next() methodu kullanıcıdan tek kelimeli string almak için kullanılır.
//        //nextLine() methodu kullanıcıdan çok kelimeli string almak için kullanılır.
//
//        //Example 2--> Kullanıcıdan adres alıp yazdırınız
//        Scanner input3=new Scanner(System.in);
//        System.out.println("Adres giriniz");
//        String address= input3.nextLine();
//        System.out.println("address = " + address);

        //Example 3--> Kullanıcıdan iki sayı alıp 4 işlem yapan ve sonucu yazdıran kodu yazın.
        Scanner input4=new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        double digit1=input4.nextDouble();
        double digit2=input4.nextDouble();
        System.out.println(digit1+digit2);
        System.out.println(digit1-digit2);
        System.out.println(digit1*digit2);
        System.out.println(digit1/digit2);

    }
}
