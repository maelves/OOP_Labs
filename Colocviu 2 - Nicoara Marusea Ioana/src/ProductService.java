import java.util.List;
import java.util.Map;

public class ProductService extends ProductRepository implements AppService<Product>{

    @Override
    public List<Product> search(String key) {
        for(Map.Entry<String,Product> e: products.entrySet()) {
            System.out.println(e.getKey()+" date: "+e.getValue());
        }
        return null;
    }

    @Override
    public Product create(Product productX) throws ValidationFailedException {
        if(!isNullOrEmpty(productX.getName()) ||  productX.getPrice()>0)
            return super.create(productX);
        else throw new ValidationFailedException("Price or name invalid");
    }

    @Override
    public boolean delete(Product productX)  {
        try {
            super.delete(productX);
            return true;
        }catch (ProductNotFoundException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean isNullOrEmpty(String str) {
        if (str != null && !str.isEmpty())
            return false;
        return true;
    }
}