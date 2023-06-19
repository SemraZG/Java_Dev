package varargs;

public class Varargs {
/**
 * if you want to make the parameters limit flexible in a method, use "VarArgs".
 * To create VarArgs "data type + ... + space + a name for the VarArgs.
 * VarArgs use Arrays behind. When you work with VarArgs, you can think you are working with Arrays.
 * VarArgs can accept zero or more elements.
 * More than one varargs can not be used in a method parantheses.
 *
 */
public static void main(String[] args) {
    System.out.println(add(1,2,3));
    System.out.println(add(4, 8, 9, 10));

    getInitials("Ali Can", "Kemal Han", "Semra Zengin");//istediğim kadar isim yazabilirim
}

    public static int add(int... a){
    int sum=0;
    for (int w: a){
    sum+=w;
    }
    return sum;
  }

  //verilen isimlerin ilk harflerini consola yazdıran method olusturun
  public static void getInitials(String... a){
    String initials="";
    for (String w: a){
       initials=initials +w.charAt(0) + w.split(" ")[1].charAt(0);
        System.out.println(initials);
        initials="";
    }
  }

}
