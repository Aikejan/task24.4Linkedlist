import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products = new ArrayList<>();

    public Basket(ArrayList<Product> products) {
        this.products = products;

    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return " \n products: " + products;
    }
}