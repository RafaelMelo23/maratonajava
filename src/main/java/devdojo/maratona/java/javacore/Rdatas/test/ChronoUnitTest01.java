package devdojo.maratona.java.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {

    public static void main(String[] args) {

        LocalDateTime aniversario = LocalDateTime.of(2005, 05, 29, 10, 15);

        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.HOURS.between(aniversario, now));
        System.out.println(ChronoUnit.MINUTES.between(aniversario, now));
        System.out.println(ChronoUnit.SECONDS.between(aniversario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));
    }
}
