// Introduction to array in java

public class Test1 {
    public static void main(String[] args) {

        // Declear and initialize the array
        int [] a = {10, 20, 30, 40};

        // arr.length find the length of the array
        System.out.println(a.length);   // 4

        // Accessing the array element
        System.out.println(a[0]);      // 10
        System.out.println(a[1]);      // 20

        // Modify the array element
        a[1] = 60;
        System.out.println(a[1]);

        // System.out.println(a[4]);   // It throws an exception that array index is out of bound
        // It is better than C and C++, In C and C++ array bound are not checked (Run Time Error)
    }
    
}


// Note:-
// Different ways to create array

// 1.
/* 
int[] a;
a = new int[3];  // this is dynamically allocated memory, and it going to be created in heap
a[0] = 10;
a[1] = 20;
a[2] = 30; 
*/


// 2.
/* 
int[] a = new int[3];
a[0] = 10;
a[1] = 20;
a[2] = 30; 
*/


// 3.
/* 
int[] a = {10,20,30}; 
*/


// 4.
/* 
int[] a = new int[3];
int x = 10;
for(int i = 0; i < a.length; i++)
{
    a[i] = x;
    x = x+10;
} 
*/
