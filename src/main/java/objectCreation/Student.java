package objectCreation;

public class Student {
    //Variable lar-->pasif özellikler
    public String name="semra";
    public byte grade=8;
    public String address="Ankara";

    //method-->aktif özellikler
    public void study(){
        System.out.println("Günlük tekrar");
    }
    public void feed(){
        System.out.println("Sağlıklı beslenir");
    }

}
