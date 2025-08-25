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
        }
    }
}
// Daemon x User
public class ThreadTest01 {

    public static void main(String[] args) {

//        ThreadExample t = new ThreadExample('a');
//        ThreadExample t1 = new ThreadExample('b');
//        ThreadExample t2 = new ThreadExample('c');
//        ThreadExample t3 = new ThreadExample('d');

        Thread t = new Thread(new ThreadExampleRunnable('a'));
        Thread t1 = new Thread(new ThreadExampleRunnable('b'));
        Thread t2 = new Thread(new ThreadExampleRunnable('c'));
        Thread t3 = new Thread(new ThreadExampleRunnable('d'));

        t.start();
        t1.start();
        t2.start();
        t3.start();
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
