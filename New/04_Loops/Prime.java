import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not a Prime No");
                return;
            }
        }

        System.out.println("Prime No");


        // Another way to do the same thing
        /* 
        boolean flag = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Not a Prime No");

        } else {

            System.out.println("Prime No");
        } 
        */
        
        
    }
}
