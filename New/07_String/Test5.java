// Topic:- StringBuilder and StringBuffer in java

public class Test5 {
    public static void main(String[] args) {

        // String Class
        String s1 = "geeks";
        String s2 = s1;         // s1---> "geeks" <---s2
        s1 = s1 + "forgeeks";   // Now, s1---> "geeksforgeeks" and s2---> "geeks"

        if (s1 == s2) {
            System.out.println("same");

        } else {
            System.out.println("Not same");
            
        }


        // StringBuilder Class

        StringBuilder str1 = new StringBuilder("geeks");
        StringBuilder str2 = str1;             // str1---> "geeks" <---str2
        str1 = str1.append("forgeeks");   // Now, str1---> "geeksforgeeks" <---str2

        if (str1 == str2) {
            System.out.println("same");

        } else {
            System.out.println("Not same");
            
        }
    }
}

// Note:-
// StringBuilder => mutable string
// StringBuffer => mutable string and thread safe

// when you do not need to change the string then use String Class
// when you need to change the string then use StringBuilder Class



