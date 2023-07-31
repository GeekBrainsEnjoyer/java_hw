package seminar7;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    protected List<Product> productsList = new ArrayList<>();

    
    public VendingMachine(List<Product> productsList) {
        this.productsList = productsList;
    }
    
    public void add(Product product){
        
    } 

    public void initProduct(List<Product> list) {
        productsList = list;
    }

    public void getProduct(String nameProduct) {
        boolean findProduct = false;

        for (Product product : productsList) {
            if (product.getName(product).equals(nameProduct) && product.getQuantity(product) > 0) {
                System.out.println("You get a product!");
                product.setQuantity(product.getQuantity(product) - 1);
                findProduct = true;

            } else if (product.getName(product).equals(nameProduct) && product.getQuantity(product) <= 0) {
                System.out.printf("Sorry( Product %d is over.", nameProduct);
                findProduct = true;
            }
        }

        if (!findProduct)
            System.out.printf("Product %s is not found.", nameProduct);
        System.out.println();
    }

    public List<Product> getProductsList(List<Product> productsList) {
        return productsList;
    }

    public void getInfo() {
        for (Product product : productsList) {
            System.out.println(product.toString());
        }
    }
}
