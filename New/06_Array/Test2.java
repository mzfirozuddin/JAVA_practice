// Topic:- []a vs a[] in java

public class Test2 {
    public static void main(String[] args) {

        // Here we declear single variavle

        // here both work fine
        int []a = new int[4];
        int b[] = new int[4];


        // here also both work fine
        int []c;
        c = new int[4];

        int d[];
        d = new int[4];



         // Here we declear Multiple variavle in same line

        // here also both work fine
        int p[], q;
        p = new int[4];
        q = 10; 


        // here it create problem
        int []r, s;
        r =new int[4];
        // s = 10;  // throws error ( error is:- incompatible types: int cannot be converted to int() )

        // to fixed this we have to do
        // s = new int[4];
        //     OR
        // we have to move square brackets to right side of variable name
        // eg:- int r[], s;

        int [] x;   // it is a recomended syntax to declear or create a array
        // it clearly says that "int[]" is a data-type and "x" name of vaiable
    }
}


// here Note is written within the code