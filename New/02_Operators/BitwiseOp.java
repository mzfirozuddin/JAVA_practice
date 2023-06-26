public class BitwiseOp {
    public static void main(String[] args) {
        int x = 3, y = 6;

        // Bitwise AND (&)
        System.out.println(x & y);

        // Bitwise OR (|)
        System.out.println(x | y);

        // Bitwise XOR (^)
        System.out.println(x ^ y);

        int z = 33;
        // Right Shift(>>)
        System.out.println(z>>1); //16
        System.out.println(z>>2); //8

        // signed right shift
        int p = -2;
        System.out.println(p>>1); 
        System.out.println(p>>2); 
    }
}


//Note:-
// Bitwise Operator:  &, |, ^, >>, <<
// Bitwise Operator Process number bit by bit

// 1. Bitwise AND (&): {0 & 0 => 0}, {0 & 1 => 0}, {1 & 0 => 0}, {1 & 1 => 1}
// Eg:-
//    x: 0...0011 =3
//    y: 0...0110 =6
// ----------------
//(x&Y): 0...0010 =2

// 2. Bitwise OR (|): {0 | 0 => 0}, {0 | 1 => 1}, {1 | 0 => 1}, {1 | 1 => 1}
// Eg:-
//    x: 0...0011 =3
//    y: 0...0110 =6
// ----------------
//(x|Y): 0...0111 =7

// 3. Bitwise XOR (^): {0 | 0 => 0}, {1 | 1 => 0}, {1 | 0 => 1}, {0 | 1 => 1}
// In case of bitwise XOR(^) when both the bit are same then output is 0 and when both the bit it different then output is 1.
// Eg:-
//    x: 0...0011 =3
//    y: 0...0110 =6
// ----------------
//(x^Y): 0...0101 =5

// 3. Right Shift (>>): 
// Eg:- for positive number (In case of positive number filled the leading bit with 0)
//     x=33 : 00...100001
//             --------->
//(x>>1)=16 : 00...010000
//             --------->
//(x>>2)=8 :  00...001000

// Eg:- for negative number (In case of negative number filled the leading bit with 1)
// -2 = 2^32 - 2 (2's complement form)
//   x = -2 : 1111...10
//(x>>1)=-1 : 1111...11
//(x>>2)=-1 : 1111...11

// 4. Left Shift (<<): It is same as right shift Only diff is bits are shift in left side.