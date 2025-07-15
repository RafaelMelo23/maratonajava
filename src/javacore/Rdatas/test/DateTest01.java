package javacore.Rdatas.test;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class DateTest01 {

    public static void main(String[] args) {

        Date date = new Date(1752593178493L);
        date.setTime(date.getTime() + 3_600_000L);
        System.out.println(date);

    }

}
