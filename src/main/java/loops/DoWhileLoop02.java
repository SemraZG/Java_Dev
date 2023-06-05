package loops;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
        /*
        username="admin", password="pwd123"
        kullanıcıdan username ve password alın, alınanlar doğru ise "hosgeldiniz" yazdırın,
        yanlıssa 4 kere "username ve password gırınız" mesajı verin, 4.kere de yanlıs giirerse "hesabınız bloke olmustur" mesajı yazdırın.
         */

        Scanner input=new Scanner(System.in);
        int counter=0;
        do {
            if (counter==4){
                System.out.println("hesabınız bloke olmustur");
                break;
            }
            System.out.println("username ve password giriniz");
            String username=input.next();
            String password=input.next();
            if (username.equals("admin")&&password.equals("pwd123")){
                System.out.println("hosgeldiniz");
                break;
            }
            counter++;

        }while (true);
    }
}
