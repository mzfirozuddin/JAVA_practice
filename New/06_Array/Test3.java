// Topic:- Array working and Types

class Point
{
    int x,y;
    Point(int a, int b)
    {
        x = a;
        y = b;
    }
}

public class Test3 {
    public static void main(String[] args) {

        int[] a = new int[4];    // By default this array filled with 0
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        float[] f = {10.5f, 15.8f, 13.3f};  // they are stored at contiguous locations

        Point[] p = {new Point(10, 20), new Point(5, 10), new Point(15, 25)};
        // In this case references are stored at contiguous locations
        // they are stored in heap locations
    }
}


// Note:- Array Working

// 1. Uninitialized array elements have 0 values
//    int array => 0
//    boolean array => false
//    double array => 0.0   

// 2. All items should of the same type.
// 3. Primitives are stored at contiguous locations.
// 4. Non Primitives references are stored at contiguous locations.


// Advantages of array:-
// 1. Random Access
//    address of ith item = (address of first item) + i*(size of an item)
// 2. Cache Friendly

// Disadvantages of array:-
// 1. Insertions and Deletions are Slow
// 2. Search is also slow for unsorted array.


// Note:- Array Types

// Dimensions:
// 1. One Dimensional
// 2. Multi Dimensional

// Size:
// 1. Fixed Size (Normal Array)
// 2. Dynamic Size (ArrayList, Vector)