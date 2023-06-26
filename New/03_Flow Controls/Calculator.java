// Problem: Make a calculator

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select The Operation:\n1. Addition\n2. Substraction\n3. Multiplication");
        int operation = sc.nextInt();

        if (operation != 1 && operation != 2 && operation != 3) {
            System.out.println("Invalid Operaton Choose!");
            return;
        }

        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();

        System.out.print("Result is: ");

        switch (operation) {
            case 1:
                int sum = num1 + num2;
                System.out.println(sum);
                break;

            case 2:
                int sub = num1 - num2;
                System.out.println(sub);
                break;

            case 3:
                int mul = num1 * num2;
                System.out.println(mul);
                break;
        
            default:
                
                break;
        }
    }
}
