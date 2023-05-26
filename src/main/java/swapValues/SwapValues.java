package swapValues;

public class SwapValues {
    public static void main(String[] args) {
        //swap işlemi ile a ile b nin değerlerini yer değiştirin.
        int a =12;
        int b=5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a = " + a);//a = 5
        System.out.println("b = " + b);//b=12

        //swap işlemi ile a ile b nin değerlerini 3. kutuyu oluşturmadan yer değiştirin
        int c=10;
        int d=20;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        c=c+d;//c=30
        d=c-d;//d=10
        c=c-d;//c=20
        System.out.println("c = " + c);//c=20
        System.out.println("d = " + d);//d=10

    }
}
