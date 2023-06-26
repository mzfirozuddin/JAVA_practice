public class Str1{
    public static void main(String[] args) {
        String name = "Firoz";
        String lname="Uddin";
        System.out.println(name);
        
        // calculate length of string
        System.out.println(lname.length());

        //concatenate two or multiple string
        String newStr= name+" "+lname;
        System.out.println(newStr);

        // to know the character at a particular position
        System.out.println(name.charAt(0));
        System.out.println(lname.charAt(2));

        // replace any character in a string
        String str = name.replace('z','j');
        System.out.println(str);    // it can't change the main string bacause in java string are immutable

        // create a substring 
        System.out.println(lname.substring(0,3)); // it takes 0th to 2nd character and create a substring
    }
}