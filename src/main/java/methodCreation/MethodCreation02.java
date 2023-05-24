package methodCreation;



public class MethodCreation02 {
    /**
     * Eğer bir method yeni birşey üretmiyorsa sadece ekrana yazdırmak gibi,return type i void olur,
     * retur type void olduğu için de return keyword yazılmaz.

     */
    public static void main(String[] args) {

        print("hello world");

        //Example 1-->Girilen bir kelimeyi ekrana yazdıran bir method oluşturun.
        //Method oluşturmada ikinci yol:
        //1.main method içinde iken methodda kullanılacak variableri oluşturun,
        String str="Hello World";
        //2. method ismi ve parametreleri yazın,
        printt(str);

        //Verilen iki tamsayıyı çarpan ve ekrana yazdıran method oluşturun
        int a=3;
        int b=5;
        multiplyTwoDigit(a,b);

        //Verilen tamsayının karesini hesaplayıp ekrana yazdıran method oluşturun
        int c=2;
        tamsayıKaresi(c);
    }

    private static void tamsayıKaresi(int c) {
        System.out.println(c*c);
    }

    private static void multiplyTwoDigit(int a, int b) {
        System.out.println(a*b);
    }

    public static void printt(String str) {
    }

    //Example 1-->Girilen bir kelimeyi ekrana yazdıran bir method oluşturun.
    public static void print(String str){
        System.out.println(str);
    }





}
