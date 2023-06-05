package loops;

import java.util.Scanner;

public class ForLoops04 {
    public static void main(String[] args) {
        //Hiç sayı kullanmadan 1den 100e kadar olan sayıları yazdırın
        for (int i='d'/'d'; i<='d'; i++){//'d'=100
            System.out.print(i+" ");
        }

        /*
        Asağıdaki cıktıyı verecek kodu yazın
        Week: 1
            Day:1
            Day:2
            Day:3
            ...
        Week: 2
            Day:1
            Day:2
            Day:3
            ...
         */

        for (int i=1; i<5; i++){
            System.out.println("Week: "+i);
            for (int t=1; t<8; t++){
                System.out.println("\tDay: "+t);
            }
        }



        /*
        kullanıcının verdiği veriye göre Asagıdakı gibi bir sekli konsola yazdırın
        X X X X X
        X X X X X
        X X X X X
      */
        Scanner input=new Scanner(System.in);
        System.out.println("Satır sayısnı giriniz");
        int row=input.nextInt();
        System.out.println("Sutun sayısnı giriniz");
        int column=input.nextInt();
        for (int i=1; i<=row; i++){

            for (int t=1; t<=column; t++){
                System.out.print("X ");
            }
            System.out.println();
        }

             /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        Scanner input2=new Scanner(System.in);
        System.out.println("Row giriniz");
        int row2=input2.nextInt();
        for (int i=1; i<=row2; i++){
            for (int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}
