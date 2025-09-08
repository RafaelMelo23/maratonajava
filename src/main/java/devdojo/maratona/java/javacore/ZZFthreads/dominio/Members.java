package devdojo.maratona.java.javacore.ZZFthreads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {

    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {

        synchronized (emails) {
            return emails.size();
        }
    }

    public void addMemberEmail(String email) {

        synchronized (this.emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Added an email to the list");

            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");

        synchronized (this.emails) {

            while (this.emails.isEmpty()) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " doesnt have any emails, waiting");
                this.emails.wait();
            }

            return this.emails.poll();
        }
    }

    public void close() {
        open = false;

        synchronized (this.emails) {
        System.out.println(Thread.currentThread().getName() + " Notifying everyone that we wont be getting emails");

        }
    }
}
