package seminar7;

public class Beverage extends Product {
    double volume;

    public Beverage(String name, int price, double volume, int quantity) {
        super(name, price, quantity);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%s, Volume: %,.2f ", super.toString(), this.volume);
    }

    public double getVolume(Beverage product){
        return volume;
    }
}
