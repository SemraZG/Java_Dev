package arrays_forEachLoop;

public class PassByValue {
    public static void main(String[] args) {
      int shirtPrice=100;
        System.out.println(discount("student", shirtPrice));//90
        System.out.println(shirtPrice);//100-->Java passByValue konsepti ile orjinal değeri korudu
        System.out.println(discount("veteran", shirtPrice));
        System.out.println(discount("senior",shirtPrice));

        String name="Tom Hanks";
        System.out.println(addTitle("Dr.", name));//Dr.Tom Hanks
        System.out.println(name);//Tom Hanks
    }
    public static int discount(String type, int price){
        switch (type){
            case "student" :
                price=price-10;
                break;
            case "veteran" :
                price=price-20;
                break;
            case "senior" :
                price=price-5;
                break;
            default:
                price=price;
        }
        return price;
    }

    public static String addTitle(String title, String name){
        name=title+name;
        return name;
    }
}
