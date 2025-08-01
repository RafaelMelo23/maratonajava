package javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        LocalDate nowAfterTwoYears = now.plusYears(2);

        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(2);
        Period p3 = Period.ofWeeks(10);
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3.getMonths());
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(p3.getDays())).getMonths()); // .getmonths nao e normalizado
    }
}
