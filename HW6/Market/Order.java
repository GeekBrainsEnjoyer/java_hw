package HW6.Market;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order<T extends Product> implements Iterable<Product> {
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

    

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getTotalCost() {
        return this.totalCost;
    }

    /*
     * Тут проблема в том, что в классе есть методы, создающие его. Это нарушает принцип единой ответственности.
     * Оптимально, как мне кажется, надо этот метод добавить в отдельный интерфейс, и уже этот интерфейс имплементировать
     * к другим классам, которые эта функция потребуется. 
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
     * С этим методом как и с предыдущим. Возможно их надо добавить в ращные интефейсы, а может и в один.
     */
    public Order<T> createOrder(List<T> marketList) {
        totalCost = 0;
        for (Product product1 : this.orderList) {
            for (Product product2 : marketList) {
                if (product1.getName().equals(product2.getName()))
                    totalCost += product2.getPrice() * product1.getQuantity();
            }
        }
        return new Order<>(this.client, this.orderList, totalCost);
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

    public Human getClient() {
        return client;
    }

    public void setClient(Human client) {
        this.client = client;
    }

    public List<Product> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Product> orderList) {
        this.orderList = orderList;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }
}
