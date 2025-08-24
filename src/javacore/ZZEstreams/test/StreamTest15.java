package javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest15 {

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000;

        sumFor(num);
        sumStreamIterate(num);
        sumParallelStream(num);
        sumLongStream(num);
        sumLongStreamParallel(num);
    }

    private static void sumFor(long num) {

        System.out.println("Sum for ");
        long result = 0;
        long init = System.currentTimeMillis();

        for (int i = 1; i <= num; i++) {

            result += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num) {

        System.out.println("Sum Stream Iterate");
        long init = System.currentTimeMillis();

        Long result = Stream.iterate(1L, n -> n + 1)
                .limit(num)
                .reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelStream(long num) {

        System.out.println("Sum Stream Parallel");
        long init = System.currentTimeMillis();

        Long result = Stream.iterate(1L, n -> n + 1)
                .limit(num)
                .parallel()
                .reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStream(long num) {

        System.out.println("Sum Long Stream");
        long init = System.currentTimeMillis();

        Long result = LongStream.rangeClosed(1, num).reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamParallel(long num) {

        System.out.println("Sum Long Stream Parallel");
        long init = System.currentTimeMillis();

        Long result = LongStream.rangeClosed(1, num).parallel().reduce(0L, Long::sum);

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}

