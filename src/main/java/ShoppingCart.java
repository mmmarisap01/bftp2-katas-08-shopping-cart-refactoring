import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> productList = new ArrayList<>();

    public void add(Product product) {
        productList.add(product);
    }

    public List<Product> getProducts() {
        return productList;
    }
}
