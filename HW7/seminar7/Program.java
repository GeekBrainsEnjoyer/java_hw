package seminar7;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Beverage b1 = new Beverage("cola", 1, 1, 100);
        Beverage b2 = new Beverage("fanta", 1, 0.5, 100);
        Beverage b3 = new Beverage("Water", 1, 0.5, 100);

        HotBeverage hb1 = new HotBeverage("cofe", 2, 0.3, 100, 45);
        HotBeverage hb2 = new HotBeverage("tea", 1, 0.3, 100, 45);

        VendingMachine machineList = new VendingMachine();
        List<Product> listOfProducts = new ArrayList<>();
        HotBeverageVendingMachine hotMachineList = new HotBeverageVendingMachine();
        List<Product> listOfHotBeverage = new ArrayList<>();

        listOfProducts.add(b1);
        listOfProducts.add(b2);
        listOfProducts.add(b3);

        listOfHotBeverage.add(hb1);
        listOfHotBeverage.add(hb2);

        hotMachineList.initProduct(listOfHotBeverage);
        machineList.initProduct(listOfProducts);

        machineList.getInfo();
        machineList.getProduct("cola");
        hotMachineList.getInfo();
        hotMachineList.getProduct("cofe");

    }

}
