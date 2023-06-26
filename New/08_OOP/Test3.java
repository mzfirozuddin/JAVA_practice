// ? "this" reference in Java

class Point
{
    int x, y;

    Point(int x, int y)
    {
        // * Here if we do not use "this" keyword, the local variable x and y removes the class variable x and y
        this.x = x;
        this.y = y;
    }

    //* "this" reffers to an object, "this" is pass automatically in print() function 
    void print()
    {
        System.out.println(x + " " + y);
    }

    Point setX(int x)
    {
        this.x = x;
        return this;
    }

    Point setY(int y)
    {
        this.y = y;
        return this;
    }

    //* We can change constructor using "this" keyword
    Point()
    {
        this(10, 10);
    }
}
public class Test3 {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        p1.print();

        //! Chaining of functions
        p1.setX(2).setY(3);

        Point p2 = new Point(30,40);
        p2.print();
    }
}
