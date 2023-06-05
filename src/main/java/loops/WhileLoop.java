package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
   //for loop ile while loop aynı sadece syntacsleri farklı
        //3den 6ya kadar sayılatı yazdırın
        for (int i=3; i<7; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        //while loop-->2.yol--3den başla, while içindeki sart dogru olduğu surece kod partı calıstır
        int i=3;
        while (i<7){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        //23den 12ye kadar olan çift sayıları yazdırın
        int k=23;
        while (k>11){
            if (k%2==0){
                System.out.print(k+" ");
            }
            k--;
        }

        /*kullanıcının verdiği sayı için çarpım tablosu oluşturup yazdırın
        3-->3*1=3
            3*2=6
            3*3=9
     ...*/
        Scanner input=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int digit=input.nextInt();
        int m=1;
        while (m<11){
            System.out.println(digit+"*"+m+"="+(digit*m));
            m++;
        }

        //verilen stringdege her harfin sonuna * ekleyin--Java-->J*a*v*a*
        System.out.println("bir kelime giriniz");
        String word=input.next();
        String newWord="";
        int n=0;
        while (n<word.length()){
            newWord=newWord +word.charAt(n)+"*";
            n++;
        }
        System.out.println(newWord);

        //stringdeki uniqe karakterleri yazdırın
        String s="Sarımsaklı";
        String newS="";
        int a=0;
        while (a<s.length()){
            char ch=s.charAt(a);
            if (s.indexOf(ch)==s.lastIndexOf(ch)){
                newS=newS+ch;
            }
            a++;
        }
        System.out.println(newS);//Srmskl
    }

}
