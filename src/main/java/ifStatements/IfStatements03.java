package ifStatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
    //Kullanıcıdan yas değerini alın ve yaşın hangi evrede olsuğunu gösterin
        // 0-4-bebek, 5-12-cocuk, 13-20-genc, 21-30-yetiskin, 30 üstü-tanımlanmamıs, hata mesajı-gecerli yas girin
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=input.nextInt();
        if (age<0){
            System.out.println("geçerli bir yas girin");
        }else if (age<5){
            System.out.println("bebek");
        } else if (age<13) {
            System.out.println("cocuk");
        } else if (age<21) {
            System.out.println("genc");
        } else if (age<31) {
            System.out.println("yetişkin");
        }else{
            System.out.println("tanımlanmamış yas");
        }
    }
}
