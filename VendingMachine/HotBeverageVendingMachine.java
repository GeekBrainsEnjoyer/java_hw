package VendingMachine;

import java.util.List;

public class HotBeverageVendingMachine<T extends HotBeverage> extends VendingMachine<HotBeverage> {

    public HotBeverageVendingMachine(List<HotBeverage> listProducts) {
        super(listProducts);
    }

    @Override
    public void addProduct(HotBeverage item) {
        this.listProducts.add(item);
    }
}
