package objectCreation;

public class Runner {
    public static void main(String[] args) {
        /**
         * Object nasıl oluşturulur?
              Class ismi + Object ismi + = + new keyword + Constructor
              Car              myCar     =   new           Car();
              Car myCar=new Car();

         Constructor javada objeleri oluşturmak için kullanılan özel bir methoddur.
         */

        Car myCar=new Car();
        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);
        myCar.hareket();
        myCar.dur();

        Student semra=new Student();
        System.out.println("semra.name = " + semra.name);
        System.out.println("semra.address = " + semra.address);
        semra.feed();
        semra.study();

    }
}
