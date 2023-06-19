package constructor;

public class Car {
    /*
    Constructor--> classdan object üretmemize yarayan code bloklarıdır
    Biz constructor olusturmazsak Java otomatik default constructor olusturur, ne zaman ki biz contructor olustururuz o zaman java kendi default contructrını siler.
    Constructor nasıl olusturulur?
    Access mosifier + Class ismi + () + {}

    Method ile constructor arasındaki farklar nedir?
    1-Methodda return type olur, consturcturda olmaz
    2-Method ismini biz veririz isteğimize göre, contructrun ismi class ismi ile aynı olmak zorunda.
    3-Method bir aksiyon yapmak için olusturulur, constructor ise object olusturmak içindir.
     */

    String make="Honda";
    String model="Accord";
    int year=2023;
    boolean hybrid=true;

    public Car(String make, String model, int year,boolean hybrid){
       this.make= make;
       this.model=model;
       this.year=year;
       this.hybrid=hybrid;
    }

    public Car(String make, String model){
       this.make=make;
       this.model=model;
    }

    public Car(String make, int year) {//--generate->Constructor->istedikelrini seç
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
