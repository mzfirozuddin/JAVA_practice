import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int size = sc.nextInt();
        int[] marks = new int[size];

        // taking array input from user
        for(int i=0;i<size;i++){
            marks[i] = sc.nextInt();
        }
        
        //printing the array element
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
        
    }
}