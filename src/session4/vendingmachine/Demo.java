package session4.vendingmachine;

public class Demo {

    public static void main(String[] args) {

        Product sandwich = new Product("Sandwich");
        sandwich.setPrice(70);
        Product yogurt = new Product("Yogurt");
        yogurt.setPrice(50);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setProductAtSlot(sandwich,0);
        vendingMachine.setProductAtSlot(yogurt,1);


        PaymentMethod paymentMethod = new PaymentMethod(1000);

        Sale sale = vendingMachine.sellProduct(0, paymentMethod);

        if (sale !=null)
            System.out.println("Everything went fine!");
        else
            System.out.println("There was a problem!");

    }
}
