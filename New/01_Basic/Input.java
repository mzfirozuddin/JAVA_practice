// Example of BufferReader Class

/* import java.io.*;  // It means we use all IO packeg
public class Input {
    public static void main(String[] args) throws IOException {
        // Taking Input using Buffer Reader 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String:");
        String s = br.readLine();
        System.out.println("Enter a Integer:");
        int x = Integer.parseInt(br.readLine());  // Here we taking input as string and then it convert to a integer.
        System.out.println("You Entered: "+s+" as String");
        System.out.println("You Entered: "+x+" as Integer");
    }
}  */



// Example of Scanner Class
import java.util.Scanner;
class Input
{
    public static void main(String[] args) {
        // Taking input using Scanner Class
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("You Entered String: "+s);
        int x = sc.nextInt();
        System.out.println("You Entered Integer: "+x);
        float f = sc.nextFloat();
        System.out.println("You Entered Float: "+f);
    }
}


// Note:-

// Java Input
// 1. BufferReader
// 2. Scanner


// Scanner:-
// byte => nextByte();
// short => nextShort();
// int => nextInt();
// long => nextLong();
// float => nextFloat();
// double => nextDouble();
// string => nextLine();
// boolean => nextBoolean();

