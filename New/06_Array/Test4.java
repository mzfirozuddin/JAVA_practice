// Topic:- 2D array

public class Test4 {
    public static void main(String[] args) {

        // Way to create 2D array
        int arr[][] = {{1,2,3},{4,5,6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }

        System.out.println();
        System.out.println("========================");

        // Another way to create 2D array
        int m = 2, n = 3;
        int arr1[][] = new int[m][n]; // Here we created a m*n size array

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = 10;
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println(); // here we print a new line
        }


        // We can also create jagged array
    }
}


// Note:-
// 1. Memory allocation in java is different from C++
// 2. We do not specify dimensions with array name.
//      Eg:- int arr[2][3] is invalid
//           int arr[][3] is also invalid

// Jagged Array:- A 2D array is called jagged array if all the rows are of not same size