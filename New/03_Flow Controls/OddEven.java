// Problem : Given a number n, find if the nymber is even or odd
import java.util.Scanner;

public class OddEven {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       System.out.print("Enter a number: ");
       int num = sc.nextInt();

       if (num % 2 == 0) {
            System.out.println("Even Number");
        } 
        else {
            System.out.println("Odd Number");
       }
   } 
}




// Note:-

/* 
if(condition)
{
    // Statements to be executed when condition is true
}
else
{
    // Statements to be executed when condition is not true

} 
*/