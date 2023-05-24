package objectCreation;

public class Car {
    //Her class bir kalıptır, bu kalıptan pasif(variable) ve aktif(method) özellikleri olan object ler üretiyoruz
    //Variable lar oluşturun
    public String model = "Tesla";
    public int fiyat = 20000;

    //Method lar oluşturun
    public void hareket() {
        System.out.println("tesla hızlıdır");
    }
    public void dur() {
        System.out.println("Güvenli şekilde durur");
    }

}
