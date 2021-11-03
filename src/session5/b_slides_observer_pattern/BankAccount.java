package session5.b_slides_observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private List<AccountListener> listeners = new ArrayList();

    public void addListener(AccountListener listener){
        listeners.add(listener);
    }
    public void deposit(double amount) {
        double oldBalance = this.balance;
        this.balance = this.balance + amount;
        for(AccountListener listener: this.listeners){
            listener.notify(this.balance, oldBalance);
        }
    }
}





