import java.util.HashMap;
import java.util.Map;

public class ProductRepository {
    Map<String,Product> products ;
    public ProductRepository() {
        products = new HashMap<String,Product>();
    }

    public Product create(Product productX ) throws ValidationFailedException {
        if(products.put(productX.getName().toLowerCase(),productX) != null)
            return productX;
        else {
            throw new ValidationFailedException("Bad Input!");
        }
    }

    public boolean delete(Product productX) throws ProductNotFoundException{
        if(products.remove(productX.getName().toLowerCase()) != null)
            return true;
        else
            throw new ProductNotFoundException("Product not found!");
    }

}