public class AutoBoxingProb {
    public static void main(String[] args) {
        Integer x1 = 400, x2 = 400;

        if (x1 == x2) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same"); 
        }
    }
}

// O/P:- Not Same (Because here x1 and x2 are objects that are not same)