public class Test5 {
    public static void main(String[] args) {
        int x = 5;   // It is a memory location of x

        // here we pass primitive data type, and primitive data-type by default pass by value
        fun(x);
        System.out.println(x);   // output = 5;
    }

    public static void fun(int x)  // it is a another memory locations of x
    {                               // It is pass by value
        x = x+5;
    }
}
