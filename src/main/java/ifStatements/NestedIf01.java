package ifStatements;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 3 sayı alın üçgen olma durumunu ve eğer oluyorsa eskenar olup olmadıpını montrol edin
        ucgen olma sartı
        a+b>c>|a-b|
        a+c>b>|a-c|
        c+b>a>|b-c|
         */
        Scanner input=new Scanner(System.in);
        System.out.println("3 uzunluk girin..");
        double a=Math.abs(input.nextDouble());//kullanıcının negatif değer girmesi ihtimalin ekarşı Math.abs() methodu kullandık
        double b=Math.abs(input.nextDouble());
        double c=Math.abs(input.nextDouble());
        boolean ucgenMi=(a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));
        if (ucgenMi){
            if (a==b && a==c && b==c){
                System.out.println("eskenar ucgen");
            }else{
                System.out.println("ucgendir ama eskenar ucgen değil");
            }
        }else{
            System.out.println("Ucgen değil!");
        }

    }
}
