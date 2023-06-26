class Point
{
    int x, y;
}

class Test7 {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 5;
        p.y = 5;
        System.out.println(p.x+" "+p.y);  // Output = 5 5
        fun(p);
        System.out.println(p.x+" "+p.y); // Output = 5 5

    }

    public static void fun(Point p)
    {
        p = new Point();     // Here we create a new Point() // here we override the p
        p.x = 10;
        p.y = 10;
    }
}



// Note:- 
// Application of Methods (OR Function):-

// 1. Avoid code redundancy and Easy maintenance

// 2. Make code Modular
//    Eg:- takeInput();
//         processInput();
//         produceOutput();

// 3. Abstraction (For example, in library functions we do not have to wory about internal working)