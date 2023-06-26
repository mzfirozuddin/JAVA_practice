public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swap: "+"a= "+a+" & "+"b= "+b);
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: "+"a= "+a+" & "+"b= "+b);
    }
}
