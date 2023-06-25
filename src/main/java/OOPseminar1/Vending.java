package OOPseminar1;

import java.util.ArrayList;
import java.util.List;

public abstract class Vending {
    private final List<Product> list;

    public Vending() {
        list = new ArrayList<>();
    }

    void addProduct(Product product) {
        list.add(product);
    }

    Product getProduct(String name1) {
        for (Product product : list) {
            if (name1.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }
}

