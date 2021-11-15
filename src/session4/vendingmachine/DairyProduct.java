package session4.vendingmachine;

public class DairyProduct extends Product {
    private String expirationDate;
    public DairyProduct(String name) {
        super(name);
    }

    void setExpirationDate(String date) { this.expirationDate = date; }
}
