package seminar8;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Market market = new Market();
        List<Product> listProducts = new ArrayList<>();

        listProducts.add(new Product("cola", 1, 1000));
        listProducts.add(new Product("water", 1, 1000));
        listProducts.add(new Product("wine", 10, 1000));
        listProducts.add(new Product("chicken", 5, 1000));

        market.initProducts(listProducts);
        market.productsInfo();

        Human h1 = new Human("Ivan", "cola fanta water cola cola water chicken");

        System.out.println(market.createOrder(h1).toString());

    }
}
