package session5.b_slides_observer_pattern;

public class BankStatistics implements AccountListener{
    private double totalBankBalance;

    public BankStatistics() {
        this.totalBankBalance = 0;
    }

    @Override
    public void notify(double newBalance, double oldBalance) {
        double difference = newBalance-oldBalance;
        totalBankBalance+=difference;
    }

    public double getTotalBankBalance() {
        return totalBankBalance;
    }
}


