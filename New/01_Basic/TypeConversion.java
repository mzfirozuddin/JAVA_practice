public class TypeConversion {
    public static void main(String[] args) {
        // Implicit Conversion
        int x = 100;
        long y = x;
        float z = y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // Explicit Conversion // Here highly chances to loss data
        double d = 65.4;
        int i = (int)d;  // here 65 store in i (.4 is loss)
        char c = (char)i; 
        System.out.println(i);
        System.out.println(c);
    }
}

// Note:-
// Widening or Implicit Conversion  // here it is automatic
// byte -> short -> int -> long -> float -> double
// char -> int 

// Narrowing or Explicit Conversion
// int = (int)double,.... //Here we have to mention
