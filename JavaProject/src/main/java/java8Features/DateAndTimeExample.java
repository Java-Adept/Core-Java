package java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeExample {

    public static void main(String arg[]) {

        LocalDate date= LocalDate.now();
        LocalDate yesterday= date.minusDays(1);
        LocalDate tomorrow= date.plusDays(1);

        System.out.println("Current Date :"+date);
        System.out.println("yesterday Date :"+yesterday);
        System.out.println("tomorrow Date :"+tomorrow);


        LocalTime time= LocalTime.now();
        System.out.println("Current Time :"+time);


        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String format = dateTime.format(formatter);
        System.out.println("Date in Formatted way : "+format);

    }


}
