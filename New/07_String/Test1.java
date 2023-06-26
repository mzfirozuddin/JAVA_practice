// Topic:- Introduction of String in Java
public class Test1 {
    public static void main(String[] args) {
        String str = "geeks";
        System.out.println(str.length());
        System.err.println(str.charAt(3));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,4));


        String s1 = "geek";
        String s2 = "geek"; //Here S2 does not create a new string (means does not allocate new memory), s2 reference the s1's "geek"
        // s1 ---> "geek" <--- s2
        // This is called String literal pool in java

        if (s1 == s2) {
            System.out.println("Yes");  // Yes

        } else {
            System.out.println("No");
            
        }

        String s3 = new String("geek"); // Here s3 allocate a new memory for "geek" (create a new string), Here we use "new" keyword
        if (s1 == s3) {
            System.out.println("Yes");

        } else {
            System.out.println("No");  // No
            
        }
    }
    
}

// Note:- 
// In java there are 4 way to create string

// 1. Character Array/ Arraylist
//    char[] arr = ['g','e','e','k','s'];

// 2. String Class  => This create an Immutable String
//    String str = "geeks";
//      OR
//    String str = new String("geeks");


 // This two create mutable Strings
// 3. StringBuffer Class  => This is a thread safe class, we can use it in multi thread environment
//    StringBuffer str = new StringBuffer("geeks");

// 4. StringBulider Class
//    StringBuilder str = new StringBuilder("geeks");
