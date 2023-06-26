// Problem : Day Before N Day
import java.util.Scanner;

public class DayBeforeNDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(); // Current day
        int n = sc.nextInt(); // N day
        int x = n % 7;
        int ans = d - x;
        
        if (ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println(ans + 7);  
        }
    }
}
