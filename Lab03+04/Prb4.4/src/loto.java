import java.math.BigInteger;

import static java.math.BigInteger.*;

public class loto {
    public static void main(String[] args) {
        BigInteger loto = factorial(49).divide((factorial(6).multiply(factorial(43))));
        System.out.println("Chances of winning at 6/49 are 1 in " + loto);
    }

    static BigInteger factorial(int n)
    {
        BigInteger f = valueOf(1);
        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));
        return f;
    }
}
