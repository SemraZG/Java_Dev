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
    }
}
