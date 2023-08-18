package HW6.VendingMachine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*У нас есть абстракный класс Product, от него наследует классы Beverage и Food. А от класса Beverage наследует HotBeverage.
/если нам понадобиться торговый автомат с только горячими напитками, то для этого в данный программе есть класс HotBeverageVendingMachin, но 
/мы могли бы сделать тоже самое просто типизировав простой торгоывый автомат(VendingMachine<HotBeverage>), и все бы работало.
/* */
public class VendingMachine<T extends Product> implements AddProduct<T>, Iterable<T> {
    List<T> listProducts = new ArrayList<T>();

    public VendingMachine(List<T> listProducts) {
        this.listProducts = listProducts;
    }

    public void initProducts(List<T> list) {
        this.listProducts = list;
    }

    @Override
    public void addProduct(T item) {
        this.listProducts.add(item);
    }

    @Override
    public String toString() {
        return "VendingMachin{" + listProducts + "}";
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < listProducts.size();
            }

            @Override
            public T next() {
                if (!hasNext())
                    return null;
                return listProducts.get(counter++);
            }
        };
    }
}
