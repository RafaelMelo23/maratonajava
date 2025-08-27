package javacore.ZZFthreads.service;

import javacore.ZZFthreads.dominio.Members;

public class EmailDeliveryService implements Runnable {

    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + " Starting to deliver emails");

        while (members.isOpen() || members.pendingEmails() > 0) {

            try {
                String email = members.retrieveEmail();
                if (email == null) continue;

                System.out.println(threadName + " Sending email to " + email);
                Thread.sleep(2000);

                System.out.println(threadName + " Email sent successfully to " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("All emails delivered successfully");
    }
}
