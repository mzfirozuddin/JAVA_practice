//? Class Member and Access Modifiers in Java

// package p2;
import p1.*;

//* private
class A {
    private int x;
}

//* default
// class B {
//     private int x;
// }

public class Test4 {
    public static void main(String[] args) {
        //* private
        // A objA = new A();
        // System.out.println(objA.x); //! error: x has private access in A

        //* default
        // B objB = new B();
        // objB.fun();       //!  error: class, interface, or enum expected
    }
}



//? Note:-
//! There are 4 types of access modifiers in java:-
//* 1. private:- Within the class.
//* 2. default:- Within the package. No need to define this, this is by default.
//* 3. protected:- Within the package and child classes of other package.
//* 4. public:- Anywhere.
