import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Offer extends AbstractEntity {
    private String customer;


    ArrayList<Product> products;

    public Offer(String customer, Long id) {
        super(id);
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        Iterator<Product> prod = products.iterator();

        double totalPrice = 0;
        while (prod.hasNext()) {
            double price = prod.next().getPrice();
            totalPrice = totalPrice + price;
        }

        return totalPrice;
    }

}