package VendingMachine;

public interface AddProduct<T extends Product> {

    public void addProduct(T item);
}