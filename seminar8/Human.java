package seminar8;

/*
 * поле HumanOreder строкового типа, потому что у клиента есть список имен товаров, а имя товара это одно из полей Order, но не сам класс.
 */
public class Human extends Actor {
    protected String HumanOrder;

    public Human(String name, String HumanOrder) {
        super(name);
        this.HumanOrder = HumanOrder;

    }

    public String getHumanOrder() {
        return HumanOrder;
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