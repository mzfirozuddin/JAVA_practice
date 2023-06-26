//Problem: Digit After Decimal Point
public class Test9 {
    public static void main(String[] args) {
        String num1 = "12.5835";
        String num2 = ".589";

        String ans = digitAfterDecimal(num1);
        System.out.println(ans);     // 5835

        String ans2 = digitAfterDecimal(num2);
        System.out.println(ans2);   // 589
    }

    public static String digitAfterDecimal(String no)
    {
        int pos = no.indexOf('.');

        if(pos < 0)
        {
            return "";
        }
        else
        {
            return no.substring(pos+1);
        }
    }
}
