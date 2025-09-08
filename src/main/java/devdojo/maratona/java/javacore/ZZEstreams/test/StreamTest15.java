package javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest15 {

    /* Quando vale a pena usar parallel streams?

    - Benchmark
    - Unboxing | Boxing
    - (limit, findFirst) <- deve estar ordenado, sao ruins de usar paralelamente | (findAny é bom)
    - Custo total da computacao N, P <- geralmente, se o processamento for alto usar parallels e beneficial
    - Quantidade de dados <- se for muito pequena, geralmente nao vale a pena
    - Tipos de colecoes <- Algumas colecoes sao boas para parallel, e outras nao. Arraylist por ex, bom, ja linkedlist, nao. Iterate do streams eh ruim, rangeclosed melhor
    - Tamanho do stream (tamanho definido sao melhores p/ paralelizar)
    - Processamento merge

     if (tarefa for pequena e nao pode ser dividida) {

        faz sequencialmente
     } else {

        divide em duas tarefas,
        chama o metodo recursivamente,
        espera as tarefas serem completadas

        combina o resultado
     } - fork join

     */

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

