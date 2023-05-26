package stringManipulations;

public class StringManipulations03{
    public static void main(String[] args) {
        /**
         * trim methodu baştaki ve sondaki spaceleri siler
         */

        //"  Ali Can  "--> baştaki ve sondaki spaceleri silin
        String s="  Ali Can  ";
        System.out.println(s.trim());//Ali Can

        //Aşağıdaki ürünlerin toplam fiyatını bulun
        String tv="$456.99";
        String pc="$87.99";
        String tv2=tv.replace("$", "");
        String pc2=pc.replace("$", "");
        double tv3=Double.valueOf(tv2);
        double pc3=Double.valueOf(pc2);
        System.out.println(tv3+pc3);//544.98
    }
}
