import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class Teste {
    ProductService service1 ;
    List<Product> l_test;
    List<Product> l_bun;

    @Before
    public void setUp() {
        service1 = new ProductService();
        Product product1 = new Product("Milk",22.5);
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
        l_test = service1.search("mi");
        l_bun= new ArrayList<Product>();
        l_bun.add(product1);
        l_bun.add(product2);
    }

    @Test
    public void test1(){
        assertTrue(l_test.toString().equals(l_bun.toString()));
    }
}
