package dateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {

       LocalDate myCurrentDate= LocalDate.now();
        System.out.println(myCurrentDate);//içinde bulunduğumuz ve bilgisayarımızdaki çalıstırdığımız andaki tarihi verir

       //tarihten istediğimiz bileşeni nasıl alırız
       int month= myCurrentDate.getMonthValue();
        System.out.println(month);

        System.out.println(myCurrentDate.getYear());//2023

       Month monthName= myCurrentDate.getMonth();
        System.out.println(monthName);//JUNE
        //Month javada bir Enum dır, Enum javada sabit değerleri(Ay, Gün Ulke isimleri gibi) depolamak için kullanılır.

       DayOfWeek dayName= myCurrentDate.getDayOfWeek();//DayOfWeek de bir Enumdır.
        System.out.println(dayName);

        //bu gunden 5 gun sonrası
        System.out.println(myCurrentDate.plusDays(5));

        //bu gunden 3 yıl sonrası
        System.out.println(myCurrentDate.plusYears(3));//2026-06-13

        //bu gunden 3 yıl oncesi
        System.out.println(myCurrentDate.minusYears(3));//2020-06-13

        //specific bir tarih objesi nasıl olusturulur
       LocalDate specificDate= LocalDate.of(1994,3,12);
        System.out.println(specificDate);//1994-03-12

        //kullanıcıdan aldığınız tarih gecmise aitse "gecersız tarih girdiniz" yazdırın, gelecege aitse "zamanı girebilirsiniz" yazıdırn
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter year, month and day in the given order..");
        int year=input.nextInt();
        int userMonth=input.nextInt();
        int day=input.nextInt();
        LocalDate userDate=LocalDate.of(year, userMonth, day);
        if (userDate.isBefore(LocalDate.now())){
            System.out.println("Sorry, unvalid date");
        }else{
            System.out.println("valid date, you can enter the time");
        }

        //kullanıcının girdiği tarihin gün ismini bulan kodu yazınız
        Scanner input2=new Scanner(System.in);
        System.out.println("Please enter year, month and day in the given order");
        int year2= input.nextInt();
        int month2= input.nextInt();
        int day2= input.nextInt();

        LocalDate date= LocalDate.of(year2, month2, day2);
        System.out.println(date.getDayOfWeek());

        //date formatı değiştirme
        LocalDate myDate=LocalDate.of(2023, 8, 11);
        System.out.println(myDate);//2023-08-11
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(dateTimeFormatter.format(myDate));//08/11/2023

        //11/Aug/22
        DateTimeFormatter newDateFormat=DateTimeFormatter.ofPattern("dd/MMM/yy");
        System.out.println(newDateFormat.format(myDate));//11/Aug/23
    }
}
