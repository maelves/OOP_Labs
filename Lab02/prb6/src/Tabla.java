import java.math.BigInteger;

public class Tabla {
    public static void main(String []args) {
        BigInteger s = new BigInteger("2");
        BigInteger suma = s.pow(64).subtract(BigInteger.ONE);
        System.out.println(suma);
    }
}
