package HW6.VendingMachine;

public interface AddProduct<T extends Product> {

    public void addProduct(T item);
}