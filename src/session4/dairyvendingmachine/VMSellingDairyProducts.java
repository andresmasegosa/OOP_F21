package session4.dairyvendingmachine;

public interface VMSellingDairyProducts {

    void setProductAtSlot(DairyProduct product, int slot);

    DairyProduct getProductAtSlot(int slot);
}
