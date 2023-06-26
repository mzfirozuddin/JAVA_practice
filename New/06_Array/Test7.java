// Problem:- Find the average of all array element
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        float avg = sum/n;

        System.out.println("Average of all array element: "+ avg );
    }
}
