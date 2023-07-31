package seminar8;

import java.util.List;

/*
 * как создать метод toString, чтобы он возвращал имя клиета, при этом не создавая поле client, я не понял.
 */
public class Order {

    private Human client;
    private List<Product> orderList;
    private Integer totalCost;

    public Order(Human client, List<Product> order, Integer totalCost) {
        this.client = client;
        this.orderList = order;
        this.totalCost = totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        String res = "";
        for (Product product : orderList) {
            res += product.getName(product) + " ";
        }

        return String.format("Client: %s\nOrder: %s\nPrice: %d", client.name, res, totalCost);

    }
}
