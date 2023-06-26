// Problem:- String Operations
// 1. equalsIgnoreCase()
// 2. toUpperCase()
// 3. toLowerCase()
// 4. capitalize() => (no such method found in java)
// 5. substring(start_index, start_index + 1)


public class Test4 {
    public static void main(String[] args) {
        String str1 = "HEllo";
        String str2 = "hELlo";
        String str3 = "world";
        // String str4 = "mirza firoz uddin";

        // equalsIgnoreCase()
        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); // false
        

        // toUpperCase()
        System.out.println(str2.toUpperCase());
        System.out.println(str3.toUpperCase());


        // toLowerCase() :- This is opposite of toUpperCase()

        // System.out.println(str4.capitalize());


        // substring(start_index, start_index + 1) //string sliceing
        System.out.println(str3.substring(1,4));
        System.out.println(str3.substring(1));
        // System.out.println(str3.substring(-1));  // throws exception
        //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -1


    }
}
