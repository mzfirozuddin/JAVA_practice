import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = Math.min(a, b); i >= 1 ; i--) {
            
            if ((a % i == 0) && (b % i == 0)) {
                System.out.println("GCD is: "+ i);
                break;
            }
        }
    }
}
