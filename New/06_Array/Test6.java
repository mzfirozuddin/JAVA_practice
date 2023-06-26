// Problem:- Count distinct element in an array
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(countDistinctElement(arr));
        
    }

    public static int countDistinctElement(int[] arr)
    {
        int count = 1;
        
        for (int i = 1; i < arr.length; i++) {
            boolean isDistinct = true;
            for (int j = i-1; j >= 0; j--) {

                if (arr[i] == arr[j]) {
                   isDistinct = false;
                   break; 
                }

            }

            if (isDistinct) {
                count++; 
            }
           
        }

        return count;
    }
}


// 10 20 30 10 20 15 20 