package javacore.ZZGconcorrencia.service;

import javacore.ZZGconcorrencia.dominio.Discount;
import javacore.ZZGconcorrencia.dominio.Quote;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {

    public String getPriceSync(String storeName) {
        double price = priceGenerator();
        Discount.Code discountCode = Discount.Code.values()[ThreadLocalRandom.current().nextInt(Discount.Code.values().length)];

        return String.format("%s:%.2f:%s", storeName, price, discountCode);
    }

    public String applyDiscount(Quote quote) {
        delay();

        double discountedValue = quote.getPrice() * (100D - quote.getCode().getPercentage()) / 100;
        return String.format("'%s original price: '%.2f' Applying discount code: '%s'. Final price: '%.2f'",
                quote.getStore(),
                quote.getPrice(),
                quote.getCode(),
                discountedValue);
    }

    private double priceGenerator() {
        System.out.printf("%s generating price %n", Thread.currentThread().getName());

        delay();
        return ThreadLocalRandom.current().nextDouble(1, 500) * 10;
    }

    private void delay() {

        try {
            int milli = ThreadLocalRandom.current().nextInt(200, 2500);
            TimeUnit.MILLISECONDS.sleep(milli);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

