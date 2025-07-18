package javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {

    public static void main(String[] args) {

        LocalTime time = LocalTime.of(23, 59, 59);
        System.out.println(time);

        LocalTime now = LocalTime.now();
        System.out.println(now);

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));

        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

        System.out.println(LocalTime.MIDNIGHT);
    }

}
