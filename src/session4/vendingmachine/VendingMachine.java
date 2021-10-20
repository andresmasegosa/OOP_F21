package session4.vendingmachine;

public class VendingMachine {

    private Product[] products = new Product[10];

    private Sale lastSale = null;

    public void setProductAtSlot(Product product, int slot){
        this.products[slot]=product;
    }

    public Product getProductAtSlot(int slot){
        return this.products[slot];
    }

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
