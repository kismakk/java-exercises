package collections_comparator.src.main.java.comparator.solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class ProductManager {
    public static List<Product> sortProducts(Set<Product> products) {
        List<Product> productList = new ArrayList<>(products);
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p2.getPrice(), p1.getPrice());
            }
        });

        for (Product product : productList) {
            System.out.println(product);
        }

        return productList;
    }
}
