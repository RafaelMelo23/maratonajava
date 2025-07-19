package javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate date = LocalDate.parse("2022-06-08");
        LocalTime time = LocalTime.parse("23:59:59");

        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);

        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);

        System.out.println("LocalDatateTime (date at time): " + ldt1);
        System.out.println("LocalDatateTime (time at date): " + ldt2);


    }
}
