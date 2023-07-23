package seminar7;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<Product> productList = new ArrayList<>();

    public void initProduct(List<Product> list) {
        productList = list;
    }

    public void getProduct(String nameProduct) {
        boolean findProduct = false;

        for (Product product : productList) {
            if (product.getName(product).equals(nameProduct) && product.getQuantity(product) > 0) {
                System.out.println("You get a product!");
                product.setQuantity(product.getQuantity(product) - 1);
                findProduct = true;

            } else if (product.getName(product).equals(nameProduct) && product.getQuantity(product) <= 0) {
                System.out.println("Sorry( Product is over.");
                findProduct = true;
            }
        }

        if (!findProduct)
            System.out.println("Product is not found.");
        System.out.println();
    }

    public void getInfo() {
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }
}
