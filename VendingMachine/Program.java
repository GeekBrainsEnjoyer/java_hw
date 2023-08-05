package VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Beverage b1 = new Beverage("cola", 1, 1, 100);
        Beverage b2 = new Beverage("fanta", 1, 0.5, 100);
        Beverage b3 = new Beverage("Water", 1, 0.5, 100);

        HotBeverage hb1 = new HotBeverage("cofe", 2, 0.3, 100, 45);
        HotBeverage hb2 = new HotBeverage("tea", 1, 0.3, 100, 45);

        List<Product> listOfProducts = new ArrayList<>();
        List<Product> listOfHotBeverage = new ArrayList<>();
        VendingMachine machineList = new VendingMachine(listOfProducts);
        HotBeverageVendingMachine hotMachineList = new HotBeverageVendingMachine(listOfHotBeverage);

        listOfProducts.add(b1);
        listOfProducts.add(b2);
        listOfProducts.add(b3);

        listOfHotBeverage.add(hb1);
        listOfHotBeverage.add(hb2);

        hotMachineList.initProduct(listOfHotBeverage);
        machineList.initProduct(listOfProducts);

        machineList.getInfo();
        machineList.getProduct("cola");

        machineList.getInfo();
        machineList.getProduct("sfsdf");

        hotMachineList.getInfo();
        hotMachineList.getProduct("cofe");
        

    }

}
