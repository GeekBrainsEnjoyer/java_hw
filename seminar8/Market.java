package seminar8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Market implements MarketBehavior, QueueBehavoir, Iterable<Product> {
    private List<Product> listProducts = new ArrayList<>();

    public Market(List<Product> products) {
        this.listProducts = products;
    }

    public List<Product> getProducts() {
        return listProducts;
    }

    public void initProducts(List<Product> products) {
        listProducts = products;
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

    @Override
    public Iterator<Product> iterator() {
        return new Iterator<Product>() {
            private int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < listProducts.size();
            }

            @Override
            public Product next() {
                if (!hasNext())
                    return null;
                return listProducts.get(counter++);
            }
        };
    }

}
