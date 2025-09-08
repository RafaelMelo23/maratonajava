package devdojo.maratona.java.javacore.ZZFthreads.test;

import java.util.ArrayList;
import java.util.List;

class ThreadSafeNames {

    private final List<String> names = new ArrayList<>();

    public synchronized void add(String name) {

        names.add(name);
    }

    public synchronized void removeFirst() {

        if (!names.isEmpty()) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName() + " removeu: " + names.removeFirst());
        }
    }
}
public class ThreadSafeTest01 {

    public static void main(String[] args) {

        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("William Suane");

        Runnable r = threadSafeNames::removeFirst;

        new Thread(r).start();
        new Thread(r).start();
    }
}
