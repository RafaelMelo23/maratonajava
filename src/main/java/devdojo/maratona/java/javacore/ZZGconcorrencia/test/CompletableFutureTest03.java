package devdojo.maratona.java.javacore.ZZGconcorrencia.test;

import devdojo.maratona.java.javacore.ZZGconcorrencia.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureTest03 {

    public static void main(String[] args) {

        StoreServiceDeprecated storeService = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(10, r -> {
          Thread thread = new Thread(r);
          thread.setDaemon(true);
          return thread;
        });
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<Double>> pricesFuture = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s), executorService))
                .toList();

        List<Double> pricesJoined = pricesFuture.stream()
                .map(CompletableFuture::join)
                .toList();

        System.out.println(pricesJoined);
        long end = System.currentTimeMillis();
        System.out.printf("Time taken: %d ms\n", end - start);
    }
}
