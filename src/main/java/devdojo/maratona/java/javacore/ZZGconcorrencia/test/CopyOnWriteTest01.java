package devdojo.maratona.java.javacore.ZZGconcorrencia.test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class CopyOnWriteTest01 {

    public static void main(String[] args) {

        List<Integer> list = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 2000; i++) {
            list.add(i);
        }

        // [1]
        // [1, 2]
        // [1, 2, 3]
        // [1, 2]

        Runnable runnableIterator = () -> {

            Iterator<Integer> iterator = list.iterator(); // o iterator mantem uma copia pro valor original, no momento da criacao

            try {
                TimeUnit.SECONDS.sleep(2);

                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable runnableRemover = () -> {

            for (int i = 0; i < 500; i++) {

                System.out.printf("%sRemoved %d%n", Thread.currentThread().getName(), i);
                list.remove(i);
            }
        };

        new Thread(runnableIterator).start();
        new Thread(runnableIterator).start();
        new Thread(runnableRemover).start();
    }
}
