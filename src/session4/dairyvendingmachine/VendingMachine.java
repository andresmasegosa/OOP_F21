package session4.dairyvendingmachine;

public abstract class VendingMachine {

    protected Product[] products = new Product[10];

    private Sale lastSale = null;

    public Sale getLastPayment() {
        return lastSale;
    }

    public Sale sellProduct(int slot, PaymentMethod paymentMethod){
        if (paymentMethod.pay(this.products[slot].getPrice())) {
            this.lastSale = new Sale(this.products[slot], paymentMethod, this);
            return this.lastSale;
        }else {
            return null;
        }
    }
}
