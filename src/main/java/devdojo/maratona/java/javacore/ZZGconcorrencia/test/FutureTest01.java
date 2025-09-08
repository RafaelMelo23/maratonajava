package devdojo.maratona.java.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarFuture = executorService.submit(() -> {

            TimeUnit.SECONDS.sleep(2);
            return 4.35d;
        });

        System.out.println(doingSomething());
        Double dollarResponse = dollarFuture.get(3, TimeUnit.SECONDS);
        System.out.println("Dollar: " + dollarResponse);
        executorService.shutdown();

    }

    private static long doingSomething() {

        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {

            sum += i;
        }

        return sum;
    }
}
