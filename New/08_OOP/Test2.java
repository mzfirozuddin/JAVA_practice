// ? About constructor

class Complex
{
    int p, q;
    // * This is a default constructor, we don't have to create this, compiler does
    // * But here we created this manually for understanding purpose
    Complex()
    {

    }

    void print()
    {
        System.out.println("p = "+p+", q = "+q);
    }
}

class Point
{
    int x, y;

    // * Here we create a constructor
    Point(int a, int b)  // * This is parameterise constructor
    {
        x = a;
        y = b;
    }

    void print()
    {
        System.out.println("x = "+x+", y = "+y);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        p.print();

        Complex c = new Complex();
        c.print();
    }
}

// ! Note:
// * 1. constructor is a special type of function
// * 2. constructor name is same as class name
// * 3. constructor has no return type
// * 4. when we create object of class then constructor will call immediately and automatically 
// * 5. If you do not create any constructor, complier will create a default 
// *    constructor
// * 6. And if we create any constructor then compiler do not create any constructor.
