package stringManipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        /*
        Aşağıdaki urallara göre kullanıcının girdiği password u kontrol edin.
        1-En az 8 karakter olsun
        2-space olmasın
        3-En az bir büyük en az bir küçük harf olsun
        4-En az bir rakam olsun
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Password giriniz!");
        String pwd=input.nextLine();

        //En az 8 karakter olsun
        System.out.println(pwd.length()>7);//true

        //space olmasın
        System.out.println(!pwd.contains(" "));//true

        //En az bir büyük harf olsun
        boolean uper=pwd.replaceAll("[^A-Z]", "").length()>0;
        System.out.println(uper);
        //önce büyük harfler hariç herşeyi sildik ve sildiğimiz halde büyük harflerin lenghti sıfırdan büyükse en az bir büyük harf var demektir.

        //En az bir küçük harf olsun
        System.out.println(pwd.replaceAll("[^a-z]", "").length()>0);

        //En az bir rakam olsun
        System.out.println(pwd.replaceAll("[^0-9]", "").length()>0);




    }
}
