import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.print(0);

        } else if(n == 1) {
            System.out.print(1);

        } else {
            int a = 0, b = 1;
            System.out.print(a+" "+b+" ");
    
            for (int i = 2; i < n; i++) {
                int c = a+b;
                System.out.print(c+" ");
                a = b;
                b = c;
            }
        }
       
    }
}
