package stringBuilder;

public class StringBuilder02 {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy
        sb1.reverse();
        //reverse() methodu verilen stringi ters cevirir,normalde looplar ile uzun yoldan yapıyorduk
        //ayrıca stringbuilder olduğu için yeni bir container olusturmadık, (mutable olduğu için).
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(6);
        System.out.println(sb1);//ysae s avaJ

        sb1.replace(2,5,"xxx");//2.index dahil 5.index hariç olmak uzere aradkilere xxx koy demek
        System.out.println(sb1);//ysxxxs avaJ

        sb1.insert(3, "ooo");
        System.out.println(sb1);//ysxoooxxs avaJ

        StringBuilder sb2=new StringBuilder("Java");
        StringBuilder sb3=new StringBuilder("Java");
        int r1=sb2.compareTo(sb3);//sonuc 0 ise alfabetil oralar aynı demek,-1ise sb2 sb3den bir önde demek, 1 ise sb2 sb3den alfabetik olrk bir sonda demek
        System.out.println(r1);
    }
}
