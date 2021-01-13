import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FileReader {
    static ArrayList<Product> products = new ArrayList<>();
    public static void readProducts(String filePath) {
        try {

            FileInputStream file = new FileInputStream(filePath);
            ObjectInputStream input = new ObjectInputStream(file);

            int n = input.readInt();
            for (int i = 0; i < n; ++i) {
                Product produs = (Product) input.readObject();
                if (produs.getName() == null || produs.getPrice() == 0.0) {
                    throw new InvalidReadException("Invalid data from file");
                }
                products.add(produs);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvalidReadException e) {
            e.printStackTrace();
        }

    }
}
