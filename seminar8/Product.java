package seminar8;

public class Product implements Comparable<Product> {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Prise: %d, Quantity: %d", this.name, this.price, this.quantity);
    }

    @Override
    public int compareTo(Product o) {
        if (this.price == o.getPrice()) {
            return 0;
        }
        if (this.price < o.getPrice()) {
            return -1;
        }
        return 1;
    }

}
