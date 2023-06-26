
import java.lang.Math;
import java.util.Scanner;

public class PrimeFactor {

    public static int isPrime(int n)
    {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
               return 0; 
            }
        }

        return 1;
    }

    public static void primeFactors(int n)
    {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) == 1) {
                int x = n;
                while (x % i == 0) {
                    System.out.print(i + " ");
                    x /= i;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        primeFactors(num);
    }

}

