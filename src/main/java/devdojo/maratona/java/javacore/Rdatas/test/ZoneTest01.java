package javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {

    public static void main(String[] args) {

        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        ZonedDateTime currentTimeWithJapanZone = today.atZone(tokyoZone); // Traz anotacoes da zona (nesse caso do japao), porem a data em si e a mesma da referencia (today)
        System.out.println(currentTimeWithJapanZone);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTimeJapan = nowInstant.atZone(tokyoZone); // Ja traz a data do japao aplicada
        System.out.println(zonedDateTimeJapan);

        ZoneOffset zoneOffsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = today.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(today, zoneOffsetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(zoneOffsetManaus); // Ja aplica o horario
        System.out.println(offsetDateTime3);


        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
    }
}
