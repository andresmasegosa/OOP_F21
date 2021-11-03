package session4.dairyvendingmachine;

public class DemoDairyVengingMachine {

    public static void main(String[] args) {

        Product sandwich = new Product("Sandwich");
        sandwich.setPrice(70);

        DairyProduct yogurt = new DairyProduct("Yogurt");
        yogurt.setPrice(50);
        yogurt.setExpirationDate("01/11/2021");

        DairyVendingMachine dairyVendingMachine = new DairyVendingMachine();
        //dairyVendingMachine.setProductAtSlot(sandwich,0);
        dairyVendingMachine.setProductAtSlot(yogurt,1);

        PaymentMethod paymentMethod = new PaymentMethod(1000);

        Sale sale = dairyVendingMachine.sellProduct(0, paymentMethod);

        if (sale !=null)
            System.out.println("Everything went fine!");
        else
            System.out.println("There was a problem!");

    }
}
