package ternaryAndswitch;

public class IncrementDecrement {
    public static void main(String[] args) {
        /**
         *  a=a+b;   ==  a +=b;
         *  a=a-b;   ==  a -=b;
         *  a=a*b;   ==  a *=b;
         *  a=a/b;   ==  a /=b;
         *  a=a+1;   ==  a +=1;  ==  a++;
         *  a=a-1;   ==  a -=1;  ==  a--;
         */

        int k=10;
        int l=k++;  //post-increment
        System.out.println(l);//10-- k artırılmadan l'ye konulduğu için değeri 10 oldu
        System.out.println(k);//11

        int m=15;
        int n=++m;  //pre-increment
        System.out.println(m);//16
        System.out.println(n);//16

        int a=10;
        int b=20;
        int r1=a<b ? a++ : ++b;
        System.out.println(r1);//10-->önce a'yı gördüğü için a'yı r'ye atadıktan sonra arttırma yaptı
        System.out.println(a);//11
        System.out.println(b);//20

        int r2=b<a ? a++ : ++b;
        System.out.println(r2);//21-->önce arttırmayı gördüğü için arttırılmış halini r'ye atadı
        System.out.println(a);//11
        System.out.println(b);//21

        //verilen sayının mutlak değerini hesaplayan kodu yazın
        int c=4;
        int r3=c<0 ? -1*c : c;
        System.out.println(r3);

        //2 sayının işareti aynıysa sayıları çarpan, işaretleri farklıysa "farklı işaretleri sayıları çarpamam" mesajı yazdırın
        int s=5;
        int t=-6;
        Object r4=(s>0 && t>0) || (s<0 && t<0) ? s*t : "farklı işaretleri sayıları çarpamam";
        //--> int ve string seçenekleri bir arada olduğu için Object classın içine koyduk
        //Object class javada non-primitive data typların ortak parentıdır.
        //Farklı dta typeların için ortak bir variable oluşturmak istediğimizde data type olarak Object i kullanırız.
        System.out.println(r4);


     }
}
