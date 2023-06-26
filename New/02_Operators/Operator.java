import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        // Arithmetic Operator
        int x = 10, y = 20;
        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(y/x);

        int z = (x+y*10);
        System.out.println(z);
        z = x++;  // Post Increment  // It means z = x; x = x+1;
        System.out.println(z+" "+x);
        z = ++x;   // Pre Increment  //It means x = x+1; z = x; 
        System.out.println(z+" "+x);

        System.out.println("============================");

        // Assignment Operator
        int p = 10, q = 5, r;

        p += q;  // p = p+q
        System.out.println(p);

        p %= q;  // p = p%q
        System.out.println(p);

        r = p = q;   // Associativity right to left
        // r = (p = q);   // Using Bracket is always a good idea
        // x = y + (z*p); // it is an example
        System.out.println(r);

        System.out.println("============================");

        // Logical Operators
        String user = "FIROZ", password = "firoz";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User ID:");
        String iu = sc.next();
        System.out.println("Enter Password:");
        String ip = sc.next();

        if (user.equals(iu) && password.equals(ip)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Try Again");
        }

        System.out.println("============================");

        // Relational Operators
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x < y);
        System.out.println(x > y);
        System.out.println(x <= y);
        System.out.println(x >= y);
    }
}


// Note:-

// Arithmetic Operator: +, -, *, /, %, ++, --
// +,-,*,/ => Binary Operator
// ++,-- => Unary Operator
// % => Remainder Operator

// Assignment Operator: =, +=, -=, *=, /=, %=

// Logical Operators: &&, ||, !
// && => AND (When Both The Conditions Are True)
// || => OR (When Only One Condition Is True)
// ! => NOT (It Converts trur => false and false => true)
// Logical Operator works on boolean Expression

// Short Circuiting
// if(x && y){......}
// if(x || y){......}

// Relational Operators: ==, !=, <, >, <=, >=
// Relational Operators also called "Comparison Operators"
// These Operators generally compare two values then return the result as true or false