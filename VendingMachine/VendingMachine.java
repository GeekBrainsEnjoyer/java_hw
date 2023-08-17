package VendingMachine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
