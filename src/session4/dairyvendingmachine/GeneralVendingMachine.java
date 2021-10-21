package session4.dairyvendingmachine;

public class GeneralVendingMachine extends VendingMachine implements VMSellingProducts {

    @Override
    public void setProductAtSlot(Product product, int slot) {
        this.products[slot]=product;
    }

    @Override
    public Product getProductAtSlot(int slot) {
        return this.products[slot];
    }
}
