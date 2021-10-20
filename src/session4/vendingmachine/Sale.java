package session4.vendingmachine;

public class Sale {
    private Product product;
    private PaymentMethod paymentMethod;
    private VendingMachine vendingMachine;

    public Sale(Product product, PaymentMethod paymentMethod, VendingMachine vendingMachine) {
        this.product = product;
        this.paymentMethod = paymentMethod;
        this.vendingMachine = vendingMachine;
    }

    public Product getProduct() {
        return product;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public VendingMachine getVendingMachine() {
        return vendingMachine;
    }
}
