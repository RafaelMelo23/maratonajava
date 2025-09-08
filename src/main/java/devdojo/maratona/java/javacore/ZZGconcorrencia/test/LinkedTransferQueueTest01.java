package devdojo.maratona.java.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {

    public static void main(String[] args) throws InterruptedException {
//      ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();

        System.out.println(tq.remainingCapacity());
        System.out.println(tq.add("William"));
        System.out.println(tq.offer("William"));
        System.out.println(tq.offer("William", 10, TimeUnit.SECONDS));
        tq.put("DevDojo");

        if (tq.hasWaitingConsumer()) {
            tq.transfer("DevDojo");
        }

        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy", 10, TimeUnit.SECONDS));
        System.out.println(tq.element()); // Traz o elemento mas nao o remove, e lanca ex caso a queue esteja vazia
        System.out.println(tq.peek()); // Traz mas nao remove, e retorna nulo caso vazio
        System.out.println(tq.poll()); // Traz e remove, e retorna nulo caso vazio
        System.out.println(tq.remove()); // Traz e remove a head, (lanca ex, nao nulo).
    }
}
