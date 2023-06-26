public class Test3 {
    public static void main(String[] args) {
        sum();
        sum();
    }

    public static void sum()
    {
        int x = 5, y = 10;
        System.out.println(x+y);
    }
}

// Note:-
// Here x and y are local variables
// when sum() is added to function call stack then fresh copy of x and y created
// when sum() function work is done then the x and y variable memory will be erase
