package ProductRecipe;

import java.util.*;

public final class ProductList {

    final private Map<Product, Integer> products = new HashMap<>();

    public void addProduct(Product product, Integer number) {
        if (products.containsKey(product)) {
            throw new ProductAlreadyExistsException();
        } else if (number <= 0){
            number = 1;
        }
        this.products.put(product, number);
    }
}