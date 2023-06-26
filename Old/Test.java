import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int len = input.length();
        char lastChar = input.charAt(len - 1);
        String result = input;

        if (Character.isDigit(lastChar)) {
            result += String.valueOf(len);
            if (len < 10) {
                result += String.valueOf(len);
            } else {
                result += String.valueOf(len).charAt(1);
            }
        } else {
            result += String.valueOf(len % 10);
        }

        System.out.println(result.charAt(result.length() - 1));
    }
}
