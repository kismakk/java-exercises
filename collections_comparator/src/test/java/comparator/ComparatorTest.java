package collections_comparator.src.test.java.comparator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import collections_comparator.src.main.java.comparator.solution.Product;
import collections_comparator.src.main.java.comparator.solution.ProductManager;

public class ComparatorTest {

    @Test
    public void testSortProducts() {
        Set<Product> products = new HashSet<>();
        products.add(new Product(1, "Laptop", 999.99));
        products.add(new Product(2, "Tablet", 299.99));
        products.add(new Product(3, "Smartphone", 699.99));
        products.add(new Product(4, "Keyboard", 49.99));
        products.add(new Product(5, "Monitor", 199.99));

        List<Product> sortedProducts = ProductManager.sortProducts(products);

        assertEquals(999.99, sortedProducts.get(0).getPrice());
        assertEquals(699.99, sortedProducts.get(1).getPrice());
        assertEquals(299.99, sortedProducts.get(2).getPrice());
        assertEquals(199.99, sortedProducts.get(3).getPrice());
        assertEquals(49.99, sortedProducts.get(4).getPrice());
    }
}
