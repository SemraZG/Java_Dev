package ternaryAndswitch;

public class NestedTernaryLeapYear {
    public static void main(String[] args) {
        /*
        verilen yılın leap yıl olup olmadığını kontrol edin
        1-yıl 100e bolunurse 400e de bolunmelidir
        2-yıl 100e bolunmuyorsa 4e bolunmelidir
         */
         int year= 2010;
         String isLeap= year%100==0 ? (year%400==0 ? "leap" : "leap degil") : (year%4==0 ? "leap" : "leap değil");
         System.out.println(isLeap);
    }
}
