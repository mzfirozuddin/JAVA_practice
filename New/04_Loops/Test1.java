// Program:- Write a program to 5 pairs of integers from user. For every pair(x,y), it should print (x/y) if y is not 0

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Two Number");
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                continue;
            }

            // System.out.println(x/y);
        }
        
    }
    
}


// Note:-

// continue => It is use to jump or skip in loop
// Break => It is use for break out the loop in which it is written
 
// Break and Continue both are use in loop body, whitout loop this throws an error