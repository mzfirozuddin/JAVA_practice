// Problem: Find the last digit of any number
import java.util.Scanner;
public class FindLastDigit {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int x = Math.abs(n);   // This line for negative number, here we take only the absolute value
        int lastDigit = x%10;
        System.out.println(lastDigit);
   } 
}
 