package loops;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //5dahil 5den 3e kadar tamsayıları yazdırın--do-while loop
        int a = 5;
        do {
            System.out.print(a + " ");
            a--;
        } while (a > 2);
        //5dahil 5den 3e kadar tamsayıları yazdırın--while loop
        int b = 5;
        while (b > 2) {
            System.out.print(b + " ");
            b--;
        }
        //5dahil 5den 3e kadar tamsayıları yazdırın--for-loop
        for (int i = 5; i > 2; i--) {
            System.out.print(i + " ");
        }

        //Kullanıcıdan tamsayı alın, tamsayu 100den kucukse kaybettiniz mesajı verip oyunu sonlandırın, 100 ve 100den buyykse kazandınız yazdırn ve oyuna devam ettirin
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("tamsayı giriniz");
            int num = input.nextInt();
            if (num>=100){
                System.out.println("kazandınız");
            }else{
                System.out.println("kaybetttiniz");
                break;
            }
        } while (true);


    }
}
