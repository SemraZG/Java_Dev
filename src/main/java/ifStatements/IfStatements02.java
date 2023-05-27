package ifStatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Verilen sayının negatif, pozitif ya da nötr olduğunu kontrol edin
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a digit");
        int num=input.nextInt();
        if (num>0){
            System.out.println("Positive");
        }else if(num<0){
            System.out.println("Negative");
        }else{
            System.out.println("Notr");
        }

        //Gün sayısı verildiğinde gün ismini yazan kodu yazın 1==pazar, 2==Pazartesi..
        Scanner input2=new Scanner(System.in);
        System.out.println("Enter a digit");
        int day=input2.nextInt();
        if (day==1){
            System.out.println("Sunday");
        }else if(day==2) {
            System.out.println("Monday");
        }else if(day==3) {
        System.out.println("Tuesday");
        }else if(day==4) {
        System.out.println("Wednesday");
        }else if(day==5) {
        System.out.println("Thursday");
        }else if(day==6) {
        System.out.println("Friday");
        }else if(day==7) {
        System.out.println("Saturday");
        }else {
        System.out.println("Enter a digit between 1 and 7");
        }

    }
}
