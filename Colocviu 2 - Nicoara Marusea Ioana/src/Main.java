import java.util.List;

public class Main {
    public static void main(String[] args) throws ValidationFailedException {
        Product product1 = new Product("Milk",22.5);
        ProductService service1 = new ProductService();
        try {
            System.out.println(service1.create(product1).getName());
        }catch (ValidationFailedException e){
            System.out.println(e.getMessage());
        }
        Product product2 = new Product("Miere",22.5);
        try {
            System.out.println(service1.create(product2).getName());
        }catch (ValidationFailedException e){
            System.out.println(e.getMessage());
        }
        List<Product> l = service1.search("mi");
        System.out.println(l.toString());
        if(service1.delete(product1))
            System.out.println("Product deleted!");
        l = service1.search("mi");
        System.out.println(l.toString());

    }
}