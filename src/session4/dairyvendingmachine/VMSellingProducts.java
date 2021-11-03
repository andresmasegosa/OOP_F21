package session4.dairyvendingmachine;

public interface VMSellingProducts {

    void setProductAtSlot(Product product, int slot);

    Product getProductAtSlot(int slot);
}
