package seminar8;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehavior, QueueBehavoir {
    private List<Product> listProducts = new ArrayList<>();

    public void initProducts(List<Product> products) {
        listProducts = products;
    }

    public void productsInfo() {
        for (Product product : listProducts) {
            System.out.println(product.toString());
        }
    }

    /*
     * Из-за того что заказ клиента это строка, метод createOrder ищет имена
     * продуктов в строке, а потом, если находит, дабавляет их в заказ.
     */
    public Order createOrder(Human human) {
        String[] orderNames = human.getHumanOrder().split(" ");
        List<Product> humanProducts = new ArrayList<>();
        int totalCost = 0;
        for (String string : orderNames) {
            for (Product product : listProducts) {
                if (string.equals(product.getName(product))) {
                    humanProducts.add(product);
                    totalCost += product.getPrice(product);
                }
            }
        }
        Order order = new Order(human, humanProducts, totalCost);

        return order;
    }

    @Override
    public void TakeInQueue(Actor actor) {
    }

    @Override
    public void takeOrder() {

    }

    @Override
    public void giveOrder() {
        // TODO Auto-generated method stub

    }

    @Override
    public void releaseFromQueue() {
        // TODO Auto-generated method stub

    }

    @Override
    public void acceptToMarket(Actor actor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update() {
        // TODO Auto-generated method stub

    }

}
