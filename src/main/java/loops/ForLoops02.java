package loops;

public class ForLoops02 {
    public static void main(String[] args) {
        //verilen stringi ters çeviren kodu yazın Java--avaJ
        String s = "Java";
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        //2.yol
        String ters = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ters = ters + s.substring(i, i + 1);
        }
        System.out.println(ters);
        //verilen stringde ilk a harfinden önceki tüm karakterleri yazdırın--> I love Java--> I love J
        String s2="I love Java";
        for (int i=0; i<s.length(); i++){
            char ch=s2.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.print(ch);
        }
        System.out.println();

        //verilen stringde son a'dan sonraki tüm karakterleri ters sırada yazdırın Germany-->yn
        String str="Germany";
        for (int i= str.length()-1; i>=0; i--){
            if (str.charAt(i)=='a'){
                break;
            }
            System.out.print(str.charAt(i));
        }
        System.out.println();

        //verilen stringde kucuk harfleri yazdırmayan kodu yazın Pwd12?Ab--P12?A
        String a="Pwd12?Ab";
        for (int i=0; i<a.length(); i++){
           char ch= a.charAt(i);
           if (ch>='a'&&ch<='z'){
               continue;
           }else{
               System.out.print(ch);
           }
        }
    }
}
