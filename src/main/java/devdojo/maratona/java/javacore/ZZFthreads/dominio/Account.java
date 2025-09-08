package devdojo.maratona.java.javacore.ZZFthreads.dominio;

public class Account {

    private int balance = 50;

    public int withdrawal(int amount) {

       return balance -= amount;
    }


    public int getBalance() {
        return balance;
    }
}
