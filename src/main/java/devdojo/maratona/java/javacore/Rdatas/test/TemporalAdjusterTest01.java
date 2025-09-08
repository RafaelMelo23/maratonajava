package devdojo.maratona.java.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {

        DayOfWeek currentDay = DayOfWeek.from(temporal);
        int addDay;

        switch (currentDay) {

            case THURSDAY -> addDay = 4;
            case FRIDAY -> addDay = 3;
            case SATURDAY -> addDay = 2;

            default -> addDay = 1;
        }

        return temporal.plus(addDay, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
