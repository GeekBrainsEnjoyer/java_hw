package seminar8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order implements Iterable<Product> {
    private Human client;
    private List<Product> orderList;
    private Integer totalCost;

    public Order(Human client, List<Product> order, Integer totalCost) {
        this.client = client;
        this.orderList = order;
        this.totalCost = totalCost;
    }

    public Order(Human client, List<Product> order) {
        this.client = client;
        this.orderList = order;
        this.totalCost = 0;
    }

    public Order(Human client) {
        this.client = client;
        this.orderList = null;
        this.totalCost = 0;
    }

    public void setOrderList(List<Product> orderList) {
        this.orderList = orderList;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getTotalCost() {
        return this.totalCost;
    }

    /*
     * формируется новый список продуктов который соответсвует состоянию магазина
     */
    public void validateOrder(List<Product> marketList) {
        List<Product> validateOrderList = new ArrayList<>();
        for (Product product2 : marketList) {
            for (Product product1 : this.orderList) {
                if (product2.getName().equals(product1.getName())
                        && (product1.getQuantity() <= product2.getQuantity())) {
                    validateOrderList.add(new Product(product2.getName(), product2.getPrice(), product1.getQuantity()));
                }
            }
        }
        this.setOrderList(validateOrderList);

    }
    /*
     * списов оформляется в обьект класса ордер
     */
    public Order createOrder(List<Product> marketList) {
        totalCost = 0;
        for (Product product1 : this.orderList) {
            for (Product product2 : marketList) {
                if (product1.getName().equals(product2.getName()))
                    totalCost += product2.getPrice() * product1.getQuantity();
            }
        }
        return new Order(this.client, this.orderList, totalCost);
    }

    /*
     * итератор, то есть фукциыя котороя позволяет пробегать по элементам списка
     * продуктов.
     */
    @Override
    public Iterator<Product> iterator() {
        return new Iterator<Product>() {
            private int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < orderList.size();
            }

            @Override
            public Product next() {
                if (!hasNext())
                    return null;
                return orderList.get(counter++);
            }
        };
    }
}
