// Problem:- Find the largest of three number
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print("Largest number is: ");

        // using if-else
        /* 
        if (a >= b && a>= c) { 
            System.out.println(a);

        }else if (b >= a && b >= c) {
            System.out.println(b);

        }else{
            System.out.println(c);

        } 
        */

        // using build-in method
        int ans = Math.max(a, b);          
        int finalAns = Math.max(ans, c);
        System.out.println(finalAns);
    }
}

// Note:- 
// Math.max() => It is a bulid-in method to find greater between two number
// Eg:- System.out.print( Math.max(5,10) );
// Math.min() => It is for less value
