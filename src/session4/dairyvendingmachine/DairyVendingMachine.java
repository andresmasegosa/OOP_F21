package session4.dairyvendingmachine;

public class DairyVendingMachine extends VendingMachine implements VMSellingDairyProducts {

    double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void setProductAtSlot(DairyProduct product, int slot) {
        this.products[slot]=product;
    }

    @Override
    public DairyProduct getProductAtSlot(int slot) {
        return (DairyProduct)this.products[slot];
    }
}
