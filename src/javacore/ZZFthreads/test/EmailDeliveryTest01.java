package javacore.ZZFthreads.test;

import javacore.ZZFthreads.dominio.Members;
import javacore.ZZFthreads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {

    public static void main(String[] args) {

        Members members = new Members();

        Thread william = new Thread(new EmailDeliveryService(members), "William");
        Thread suane = new Thread(new EmailDeliveryService(members), "Suane");

        william.start();
        suane.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");

            if (email.isEmpty() || email == null) {
                members.close();
                break;
            }

            members.addMemberEmail(email);
        }
    }
}
