// Passing Parameters and Returning Result
public class Test4 {
    public static void main(String[] args) {
        int x = 5, y = 10;
        int max = getMax(x,y);     // Here x and y are actual parameter
        System.out.println(max);
    }

    public static int getMax(int a, int b)  // Here a and b are formal parameter
    {
      if (a > b) {
        return a;

      }else {
        return b;

      }

    }
}
