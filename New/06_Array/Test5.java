// Problem:- Check if an array is sorted or not.

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter a number: ");
       int n = sc.nextInt();
       
       int[] arr = new int[n];
        // taking the array input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("Yes");

        } else {
            System.out.println("No");

        }
    }
}
