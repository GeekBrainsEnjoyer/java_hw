package seminar7;

public class Food extends Product {
    double weight;

    public Food(String name, int price, double weight, int quantity){
        super(name, price, quantity);
        this.weight = weight;
    }

    @Override
    public String toString(){
        return String.format("%s, Weight: %,.2f ", super.toString(), weight);
    }
}
