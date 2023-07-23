package seminar7;

public class HotBeverageVendingMachine extends VendingMachine {

    public void getProduct(String nameProduct, double volumeProduct, int temperatureProduct) {
        boolean findProduct = false;

        for (Product product : productList) {
            if (product.getName(product).equals(nameProduct) && product.getVolume(product).equals(volumeProduct)
                    && product.getTemperature(product).equals(temperatureProduct)
                    && product.getQuantity(product) > 0) {
                System.out.println("You get a product!");
                product.setQuantity(product.getQuantity(product) - 1);
                findProduct = true;

            } else if (product.getName(product).equals(nameProduct) && product.getVolume(product).equals(volumeProduct)
                    && product.getTemperature(product).equals(temperatureProduct)
                    && product.getQuantity(product) <= 0) {
                System.out.println("Sorry( Product is over.");
                findProduct = true;
            }
        }

        if (!findProduct)
            System.out.println("Product is not found.");
        System.out.println();
    }

}
