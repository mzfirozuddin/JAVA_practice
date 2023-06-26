// Problem:- Find the first digit of a number

import java.util.Scanner;
public class FirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int firstDigit = getFirstDigit(num);
        System.out.println(firstDigit);

        int lastDigit = getLastDigit(num);
        System.out.println(lastDigit);
    }

    public static int getFirstDigit(int n)
    {
        while (n >= 10) {
            n = n/10;
        }

        return n;
    }
    
    public static int getLastDigit(int n)
    {
        return (n%10);
    }
}
