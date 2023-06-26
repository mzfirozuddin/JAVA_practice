// Auto-Boxing and Auto-Unboxing in Java
public class AutoBoxing {
    public static void main(String[] args) {
        int x1 = 10;
        Integer x2 = x1;  // Auto-Boxing
        int x3 = x2;     // Auto-Unboxing
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    } 
}


// Auto-Boxing:- It is conversion(type-casting) of Primitive to corresponding Wrapper class object.
// Auto-Unboxing:- It is conversion(type-casting) of Wrapper class object to corresponding Primitive type.