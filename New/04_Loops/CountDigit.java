// Problem:- Count digit of a number.

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a nmuber: ");
        int num = sc.nextInt();
        int count = 0;
        
        while (num > 0) {
            num = num/10;
            count++;
        }

        System.out.print("Numer of digit is: " + count);
    }
}
