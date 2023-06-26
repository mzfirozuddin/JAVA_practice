/* 
 ? Introduction of class and object
*/
class complex
{
    int real, imag;

    void print()
    {
        System.out.println(real + "+i" + imag);
    }

    // * this is the constructor of complex class
    complex(int r, int i)
    {
        real = r;
        imag = i;
    }

    void add(complex c)
    {
        real = real + c.real;
        imag = imag + c.imag;
    }
}

public class Test1 
{
    public static void main(String[] args) {
        complex c1 = new complex(10, 20);
        c1.print();

        complex c2 = new complex(20, 30);
        c1.add(c2);  
        c1.print();
    }
}

// ! Note:-
// * class is a non-primitive data type
// * In java Non-primitive data type always store in heap memory
// * Class name is same as data type, object is same as variable
// *    eg:- complex c1 (same as int x)


