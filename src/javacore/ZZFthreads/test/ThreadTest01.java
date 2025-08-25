package javacore.ZZFthreads.test;

class ThreadExample extends Thread {

    private char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

class ThreadExampleRunnable implements Runnable {

    private final char c;

    ThreadExampleRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }

            try { // Uma pouca das garantias que se tem nas threads
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
// Daemon x User
public class ThreadTest01 {

    public static void main(String[] args) {

//        ThreadExample t1 = new ThreadExample('a');
//        ThreadExample t2 = new ThreadExample('b');
//        ThreadExample t3 = new ThreadExample('c');
//        ThreadExample t4 = new ThreadExample('d');

        Thread t1 = new Thread(new ThreadExampleRunnable('a'), "T1A");
        Thread t2 = new Thread(new ThreadExampleRunnable('b'), "T2B");
        Thread t3 = new Thread(new ThreadExampleRunnable('c'), "T3C");
        Thread t4 = new Thread(new ThreadExampleRunnable('d'), "T4D");

        t4.setPriority(Thread.MAX_PRIORITY); // <- nao eh garantia de que ela vai ter a prioridade
        t4.start();
        t4.start();
        t4.start();
        t4.start();
    }

    // New
    // Runnable (start), nao significa que a thread esta sendo executada
    // Waiting/Blocked
    // Running
    // Dead

    /*
        * Uma thread nao pode interferir no estado da outra, se uma esta waiting, foi por decisao dela mesma
        * uma thread nao pode voltar de waiting/blocked direto para running, apenas para runnable
     */
}
