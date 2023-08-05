package seminar8;

import java.util.List;

/*
 * поле HumanOreder строкового типа, потому что у клиента есть список имен товаров, а имя товара это одно из полей Order, но не сам класс.
 */
public class Human extends Actor {
    private List<Product> HumanOrder;

    public Human(String name, List<Product> HumanOrder) {
        super(name);
        this.HumanOrder = HumanOrder;

    }

    public Human(String name) {
        super(name);
        this.HumanOrder = null;

    }

    public List<Product> getHumanOrder() {
        return this.HumanOrder;
    }

    public void setListOrder(List<Product> order) {
        this.HumanOrder = order;
    }

    @Override
    public void setMakeOrder() {
        System.out.println("Human make a order.");
    }

    @Override
    public void setTakeOrder() {
        System.out.println("human take a order.");
    }

    @Override
    public boolean isMakeOrder() {
        return true;
    }

    @Override
    public boolean isTakeOrder() {
        return true;
    }

}