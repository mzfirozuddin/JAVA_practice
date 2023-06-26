public class Variable {
    public static void main(String [] args)
    {
        int age = 30;
        String name = "Mirza Firoz Uddin";
        float weight = 70.5f;
        System.out.println(age);
        System.out.println(name);
        System.out.println(weight);

        // data types
        boolean isValid = true;
        byte marks = 90;
        float pi = 3.14f;
        float div = 15.0f/4.0f; // here "f" represent the floating point value
        long views = 1000000000;
        char gender = 'M';
        double avg = 30.15d;   // here "d" represent the double point value


    }
}

// Note:-
// Variable Naming  
// valid Name = ab, Ab, AB, ab11, _abc, a_b, ab$,......
// Invalid Name = 11a, a#, A!, else,do, if,.......

// some convension of variable name
// use Cammel Case for valiable name. Eg:- firstName,lastName,myAges
// If you have any constant then write it in Upper Case. Eg:- MAX_AGE,..
// In java we use "final" keyword for constant, Eg:- final int MAX_AGE = 200;

// Types of Variable :-
// 1. Primitive Type (byte,short,int,char,boolean,float,double)
// 2. Non-Primitive Type (String, Array,...,Any user Define class Types)

/* // Data Types in java
 boolean => "true" or "false"
 byte => -128 to 127 (-2^7 to 2^7-1) (stored in 8 bit : 1 sign Bit and 7 bit)
 short => -32768 to 32767 (-2^15 to 2^15-1)
 int => -2147483648 to 2147483647 (-2^31 to 2^31-1) (it is 32 bit)
 long => -2^63 to 2^63-1 (it is 64 bit)
 float => Single precision 32 bit
 double => Double precision 32 bit
 char => 16 bit Unicode Characters (0 to 2^16-1)

 */