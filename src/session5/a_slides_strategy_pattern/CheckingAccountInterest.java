package session5.a_slides_strategy_pattern;

public class CheckingAccountInterest implements InterestStrategy {
    public double getInterest(double balance) {
        return balance * 0.000001;
    }
}
