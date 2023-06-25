package OOPseminar1;

public class main {
    public static void main(String[] args) {
        Vending vending = new DrinkVending();
        Product product1 = new HotDrink("Coffee", 1, 36);
        Product product2 = new HotDrink("Tee", 1, 40);
        Product product3 = new HotDrink("Milk", 1, 38);

        vending.addProduct(product1);
        vending.addProduct(product2);
        vending.addProduct(product3);

        System.out.println(vending.getProduct("Coffee"));
        System.out.println(vending.getProduct("Tee"));
        System.out.println(vending.getProduct("Milk"));
    }
}
