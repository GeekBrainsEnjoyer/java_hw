package HW6.VendingMachine;

import java.util.List;

public class HotBeverageVendingMachine<T extends HotBeverage> extends VendingMachine<T> {

    public HotBeverageVendingMachine(List<T> listProducts) {
        super(listProducts);
    }

    @Override
    public void addProduct(T item) {
        this.listProducts.add(item);
    }
}
