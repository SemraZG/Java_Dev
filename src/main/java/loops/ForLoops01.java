package loops;

public class ForLoops01 {
    public static void main(String[] args) {
        /*
        4 tür loop var:
        1-For-Loop
        2-While-Loop
        3-Do-While-Loop
        4-For-Each-Loop
         */
        //11den 14e kadar sayıları yazdırın
        for (int i=11; i<15; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        //40dan 23e kadar çift sayıları yazdırın
        for (int i=40; i>22; i--){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //28den 56ya kadar tek sayıları yazdırın
        for (int i=28; i<57; i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //21den 180e kadar hem 2 ile hem 3 ile bölünebilen tamnsayıları yazın
        for (int i= 21; i<181; i++){
            if (i%2==0 && i%3==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        //verilen kucuk harfle yazılmıs stringin indexi çift olan karakyterlerini  yazdırın ankara-->Akr
        String s= "Ankara";
        for (int i=0; i<s.length(); i++){
            if (i%2==0){
                System.out.print(s.charAt(i));
            }
        }

        System.out.println();

        //verilen kucuk harfle yazılmıs stringin indexi çift olan karakyterlerini buyuk harfe donusturen kodu yazın ankara-->AKR
        String str= "Ankara";
        for (int i=0; i<str.length(); i++){
            String ch=str.substring(i,i+1);
            if (i%2==0){
                System.out.print(ch.toUpperCase());
            }
        }
    }
}
