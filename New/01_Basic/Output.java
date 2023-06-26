public class Output {
    public static void main(String[] args) {
        // print() and println() examples
        int x = 10, y = 20;
        char z = 'G';
        String str = "GFG";

        System.out.println(x);
        System.out.println(x+y);
        System.out.println(x+" "+y);
        System.out.print(str+" ");
        System.out.print("Courses\n");

        System.out.println("======================");

        // format() or printf() example  // This is "C language" style output
        System.out.format("Value of x is %d\n",x);   // value of x is 10
        System.out.printf("Value of y is %d\n",y);  // value of x is 20
        float p = (float)Math.PI;
        System.out.println(p);
        System.out.format("Value of pi = %.2f\n",p);   //Value of pi = 3.14
        System.out.format("Value of pi = %5.2f\n",p);  //Value of pi = _3.14
        System.out.format("Value of pi = %05.2f\n",p); //Value of pi = 03.14
        System.out.printf("x=%d, y=%d",x,y);   //x=10, y=20

    }
}


// Note:-
// Java Output:

// 1. System.out.print() => It does not append any new line.
//      Or
//    System.out.println() => It is append any new line at end.


// 2. System.out.format() => This function is used for formated output. 
//      Or
//    System.out.printf() =>  This is same as previous.


// Format Specifier or Place Holder
// %d => int
// %f => float
// %s => string
// %c => char