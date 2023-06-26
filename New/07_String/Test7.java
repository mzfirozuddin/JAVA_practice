// Problem: Checking Pangram String 
//(A string is called pangram if it contents all the characters from A to Z, this character might appear either 
//        as lowercase or as an uppercase)


public class Test7 {
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog";
        String str2 = "This is a string";

        boolean ans1 = isPangram(str1);
        System.out.println(ans1);       // true

        boolean ans2 = isPangram(str2);
        System.out.println(ans2);       // false
    }

    public static boolean isPangram(String s)
    {
        int n = s.length();

        if (n < 26) {
            return false;
        }

        boolean visited[] = new boolean[26];

        for (int i = 0; i < n; i++) {
            // char x = s.charAt(i);
            int x = s.charAt(i);        // NOTE: you can take int or char, any of them

            if (x >= 'a' && x <= 'z') {
                visited[x - 'a'] = true;
            }

            if (x >= 'A' && x <= 'Z') {
                visited[x - 'A'] = true;
            }
        }

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == false) {
                return false;
            }
        }

        return true;
    }
}


// NOTE:- Approch

// Initially:-
//   Visited[] = [F,F,F,.....,F]

// After Traversal:-
//  Visited[] = [T,T,T.....T]

// Time: 0(n)
