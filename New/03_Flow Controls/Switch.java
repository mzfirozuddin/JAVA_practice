import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int x = 0, y = 0;
        System.out.println("Enter a move: ");
        Scanner sc = new Scanner(System.in);
        char move = sc.next().charAt(0);  // To take input a character

        switch (move) {
            case 'L':
                x--;
                System.out.println(x);
                break;
            case 'R':
                x++;
                System.out.println(x);
                break;
            case 'U':
                y++;
                System.out.println(y);
                break;
            case 'D':
                y--;
                System.out.println(y);
                break;
        
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
