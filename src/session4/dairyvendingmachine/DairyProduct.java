package session4.dairyvendingmachine;

public class DairyProduct extends Product {

    String expirationDate;

    public DairyProduct(String name) {
        super(name);
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }


}
