package javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String> {

    @Override
    public String call() throws Exception {

        int randomCount = ThreadLocalRandom.current().nextInt(1, 11);

        for (int i = 0; i < randomCount; i++) {

            System.out.printf("%s executando uma tarefa callable...%n", Thread.currentThread().getName());
        }

        return String.format("%s finished and the random number is %d", Thread.currentThread().getName(), randomCount);
    }
}

public class CallableTest01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        RandomNumberCallable callable = new RandomNumberCallable();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<String> future = executor.submit(callable);
        String s = future.get();

        System.out.printf("Program finished: %s%n", s);
        executor.shutdown();
    }
}
