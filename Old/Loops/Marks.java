import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do{
        System.out.print("Enter your sub marks: ");
        int marks = sc.nextInt();
        if(marks>=90){
            System.out.println("This is Excelent.");
        }else if(marks>=60 && marks<=89){
            System.out.println("This is Good.");
        }else{
            System.out.println("This is Good as Well.");
        }
        System.out.print("Enter 0 or 1: ");
        a=sc.nextInt();
        }while(a==1);
    }
}
