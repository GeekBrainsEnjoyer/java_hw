package seminar7;

import java.util.List;

public class HotBeverageVendingMachine extends VendingMachine {

    public HotBeverageVendingMachine(List<Product> productsList) {
        super(productsList);
    }

    public void getProduct(String nameProduct, double volumeProduct, int temperatureProduct) {
        boolean findProduct = false;

        for (Product product : productsList) {
            if (product.getName(product).equals(nameProduct) && product.getVolume(product).equals(volumeProduct)
                    && product.getTemperature(product).equals(temperatureProduct)
                    && product.getQuantity(product) > 0) {
                System.out.println("You get a product!");
                product.setQuantity(product.getQuantity(product) - 1);
                findProduct = true;

            } else if (product.getName(product).equals(nameProduct) && product.getVolume(product).equals(volumeProduct)
                    && product.getTemperature(product).equals(temperatureProduct)
                    && product.getQuantity(product) <= 0) {
                System.out.printf("Sorry( Product %d is over.", nameProduct);
                findProduct = true;
            }
        }

        if (!findProduct)
            System.out.printf("Product %s is not found.", nameProduct);
        System.out.println();
    }

}
