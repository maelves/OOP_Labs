import java.util.Scanner;

public class Goldbach {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n = ");
        int n = scan.nextInt();
        System.out.println("m = ");
        int m = scan.nextInt();
        scan.close();

        int[] primesRange = new int[1000];
        int dim = isPrime(n, m, primesRange);

        for(int i = n; i <= m; i++)
        {
            if(i % 2 == 0)
            {
                Conjecting(i, primesRange, dim);
            }
        }
    }

    public static int isPrime(int n, int m, int[] primesRange) {
        int ok = 0;
        int k = 0;
        if(n == 1)
            n++;
        for (int i = n; i <= m; i++) {
            ok = 0;
            for (int j = 2; j * j <= i; j++)
            {
                if (i % j == 0)
                {
                    ok = 1;
                }
            }
            if(ok == 0)
            {
                primesRange[k++] = i;
            }
        }
        return k;
    }
    public static void Conjecting(int i, int[] primesRange, int dim)
    {
        for(int j = 0; j <  dim; j++)
        {
            for(int k = dim-1; k >= j; k--)
            {
                if(primesRange[k] + primesRange[j] == i)
                {
                    System.out.println(i + " = " + primesRange[j] + "+" + primesRange[k]);
                }
            }
        }

    }
}
