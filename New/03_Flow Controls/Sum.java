// Problem :- Take a number N from user, print sum of first N natural numbers. If user enters a negative number, show error and exit.
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid Input");
            return;
        }

        System.out.println(n*(n+1)/2);


        /*  // this is another way

         if (n >= 0) {
           int sum = (n * (n + 1)) / 2; 
           System.out.println(sum);
        } else {
            System.out.println("Invalid Input");
        } 
        */
    }
}
