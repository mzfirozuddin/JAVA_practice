// Problem: Find the sum of natural number
import java.util.Scanner;
public class NaturalNoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Natural No: ");
        int n = sc.nextInt();
        int sum = (n*(n+1))/2;
        System.out.println(sum);
    }
}
