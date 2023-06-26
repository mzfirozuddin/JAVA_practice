import java.util.*;
public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int i;
        for( i=2 ; i<a ; i++){
            if(a%i==0){
                System.out.println("Not a prime no.");
                break;
            }
        }

        if(i==a){
        System.out.println("Prime no");
        }
    }
}
