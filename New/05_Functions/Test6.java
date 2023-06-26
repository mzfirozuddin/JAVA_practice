class Point
{
    int x, y;
}

class Test6 {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 5;
        p.y = 5;
        System.out.println(p.x+" "+p.y);  // Output = 5 5
        // Here we pass a non primitive data-type, and not primitive data type by default pass by reference
        fun(p);
        System.out.println(p.x+" "+p.y); // Output = 10 10

    }

    public static void fun(Point p)
    {
        p.x = 10;
        p.y = 10;
    }
}


// Note:-
// 1. primitive data-type by default pass by value
// 1. not primitive data-type by default pass by value
