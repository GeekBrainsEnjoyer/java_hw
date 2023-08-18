package HW6.VendingMachine;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Принцип инверсии зависимостей сохраняется и подставив в момент объвления класса в VendingMachine вместо Product любого его наследника, программа
корректно это обработает.
 */
public class Program {
    public static void main(String[] args) {

        Beverage b1 = new Beverage("cola", 1, 1, 10);
        Beverage b2 = new Beverage("fanta", 1, 0.5, 10);
        Beverage b3 = new Beverage("Water", 1, 0.5, 10);

        HotBeverage hb1 = new HotBeverage("cofe", 2, 0.3, 10, 45);
        HotBeverage hb2 = new HotBeverage("tea", 1, 0.3, 10, 45);

        VendingMachine<Product> vendingMachine = new VendingMachine<>(new ArrayList<>(Arrays.asList(b1)));
        VendingMachine<HotBeverage> hotMachine = new HotBeverageVendingMachine<>(
                new ArrayList<>(Arrays.asList(hb1)));

        // vendingMachine.addProduct(b1);
        vendingMachine.addProduct(b2);
        vendingMachine.addProduct(b3);

        System.out.println(vendingMachine);
        System.out.println();

        // hotMachine.Add(hb1);
        hotMachine.addProduct(hb2);

        System.out.println(hotMachine);

    }

}
