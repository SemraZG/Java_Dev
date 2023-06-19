package dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
     //anlık zamanı nasıl alırız
       LocalTime time= LocalTime.now();
        System.out.println(time);

        //anlık zamandan bilesen alma
        System.out.println(time.getHour());

        //anlık zamandan 12 saat ileri gitme
        System.out.println(time.plusHours(12));

        //anlık zamandan 30 dakika geri gitme
        System.out.println(time.minusMinutes(30));

        //zaman formatını değiştirme
        DateTimeFormatter newTimeFormat=DateTimeFormatter.ofPattern("HH : mm");
        String formattedTime=newTimeFormat.format(time);
        System.out.println(formattedTime);

                /*
                DateTime clssda kullanılan formatlar
                HH : mm ==>24lu saat sistemi
                hh : mm ==>12li saat sistemi
                hh : mm a ==>12li saat sistemi AM, PM gösterlir
                HH : mm : ss ==>24lu
                HH : MM ==> yanlıs format mm olmalı, MM month için kullanılır

                dd-MM-yyyy =>gun ay yıl
                MMM=>Aug
                MMMM=>August
                 */

        //baska bir zaman dilimindeki tarih ve zamanı nasıl alırız
       LocalDate dateIntokyo= LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateIntokyo);

        LocalDateTime dateAndTime=LocalDateTime.now();
        System.out.println(dateAndTime);//2023-06-13T18:49:27.398399
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm");
        System.out.println(dtf.format(dateAndTime));//06/13/2023 06:53

    }
}
