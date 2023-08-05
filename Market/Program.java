package Market;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> listProducts = new ArrayList<>();

        listProducts.add(new Product("cola", 1, 3));
        listProducts.add(new Product("water", 1, 5));
        listProducts.add(new Product("wine", 10, 3));
        listProducts.add(new Product("sprite", 1, 6));
        listProducts.add(new Product("tea", 2, 4));
        listProducts.add(new Product("chocolate", 5, 4));
        listProducts.add(new Product("bounty", 2, 10));
        listProducts.add(new Product("mars", 2, 10));

        Market market = new Market(listProducts);
        for (Product product : market) {
            System.out.println(product);
        }
        System.out.println();

        Collections.sort(market.getProducts());
        for (Product product : market) {
            System.out.println(product);
        }
        System.out.println();

        List<Product> humanProductList = new ArrayList<>();
        humanProductList.add(new Product("water", 4));
        humanProductList.add(new Product("bubblegum", 10));
        humanProductList.add(new Product("wine", 2));
        humanProductList.add(new Product("cola", 3));

        Human h1 = new Human("Ivan");

        Order humanOrder = new Order(h1, humanProductList);

        humanOrder.validateOrder(market.getProducts());
        for (Product product : humanOrder) {
            System.out.println(product);
        }
        System.out.println(humanOrder.getTotalCost());

        humanOrder.createOrder(market.getProducts());
        for (Product product : humanOrder) {
            System.out.println(product);
        }
        System.out.println(humanOrder.getTotalCost());

    }
}
