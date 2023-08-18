package HW6.VendingMachine;

public abstract class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(Product product){
        return name;
    }

    public int getQuantity(Product product){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity; 
    }

    @Override
    public String toString(){
        return String.format("Name: %s, Prise: %d, Quantity: %d", this.name, this.price, this.quantity);
    }

}
