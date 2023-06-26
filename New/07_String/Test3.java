public class Test3 {
    public static void main(String[] args) {
     String s1 = "geeks";
     String s2 = s1;
     s1 = s1 + "forgeeks"; // s1 = s1.concat("forgeeks");
     // Hence in java Strings are immutable, that's why "s1" refers to a new object 

     System.out.println(s1);
     System.out.println(s2);
     System.out.println(s1 == s2); // false  
    }
}
