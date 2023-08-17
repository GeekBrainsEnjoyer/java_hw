package VendingMachine;

public class HotBeverage extends Beverage{
    private int temperature;

    public HotBeverage(String name, int price, double volume, int quantity, int temperature){
        super(name, price, volume, quantity);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("%s, Temperature: %d ", super.toString(), this.temperature);
    }

    public int getTemperature(HotBeverage product){
        return temperature;
    }
}
    

