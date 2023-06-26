// Problem : Check any number is:
//                      (a) Positive Even 
//                      (b) Positive Odd 
//                      (a) Negative Even 
//                      (b) Negative Odd 
//                      (e) Zero

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number: ");
        int x = sc.nextInt();

        if (x > 0) 
        {
            System.out.print("Positive ");
            if (x % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");  
            }

        }
        else if (x < 0) 
        {
            System.out.print("Negative ");
            if (x % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");  
            }

        }
        else
        {
            System.out.println("Zero");
        }

    }
}