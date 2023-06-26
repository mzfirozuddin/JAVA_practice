// Topic:- Build-In  methods of String in java

public class Test2 {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "geeks";
        String s3 = "geeky";
        String s4 = "geeksforgeeks";
        String s5 = "for";
        
        // length() => This is use for find the length of a string
        System.out.println(s1.length());

        // contains() => This function takes a string as an argument and check with another Strings that the string present or not
        System.out.println(s1.contains(s2)); // true
        System.out.println(s1.contains(s3)); // false

        // equals() => This function returns true if both the string are same, if not same returns false
        System.out.println(s1.equals(s4)); // true
        System.out.println(s1.equals(s3)); // false
 
        /*
        compareTo() => This function check both the string in lexicographically order, if both are exactly 
        same then it returns 0 value, if  string "s1" is lexicographically greater then string "s2" then it
        return a "positive" value, if string "s1" is lexicographically smaller then string "s2" then it return
        a "negative" value.
       */
      int res = s1.compareTo(s2);

      if (res == 0) {
        System.out.println("same");
      }

      if (res > 0) {
        System.out.println("s1 is greater");
      }

      if (res < 0) {
        System.out.println("s1 is smaller");
      }

      // indexOf() => This function is return a "negative" value if string "s2" is not present in string "s1".
      // Otherwise it return index of 1st occerence of "s2" and "s1". 
      System.out.println(s1.indexOf(s5)); // 5
      System.out.println(s1.indexOf(s3)); // any negative value
     // indexOf() function takes another parameter
      System.out.println(s1.indexOf(s2,1)); // It means its start searching from index 1

      // lastIndexOf() => It is same as indexOf(), But it search from last index

      // concat() => This is use for concat a new string
      // we can alse use "+" for String concatenation
      String str1 = "geeks";
      String str2 = str1.concat("forgeeks");
      System.out.println(str2);
    }
}
