package concanitationOperatorsTypeCasting;

public class AsciiValues {
    public static void main(String[] args) {
        /**
         * Javada her karakterin sayısal değeri vardır, bu değerlere ascii values denir.
         * A=65
         * a=97
         */
        char ch='A';
        System.out.println(ch);//A
        int k='A';
        System.out.println(k);//65
        int unlem='!';
        System.out.println(unlem);//33
        char c1='a';
        char c2='?';
        System.out.println(c1+c2);//160-->Javada char değerlerini matametiksel işlemlerle kullanırsak java  o charların ascii değerlerini kullanır.
    }
}
