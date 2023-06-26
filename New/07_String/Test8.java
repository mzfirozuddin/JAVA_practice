// Problem:- Pattern Searching in string (we have to print all index of pattern string)
public class Test8 {
    public static void main(String[] args) {
        String txt1 = "geeks for geeks";
        String pat1 = "geeks"; 

        String txt2 = "abcd pqcda";
        String pat2 = "cd"; 

        String txt3 = "aaaaaa";
        String pat3 = "aaa";

        patSearch(txt1,pat1);
        patSearch(txt2,pat2);
        patSearch(txt3,pat3);
    }

    public static void patSearch(String txt, String pattern)
    {
        int pos = txt.indexOf(pattern);

        while (pos >= 0) {
            System.out.print(pos + " ");
            pos = txt.indexOf(pattern, pos+1);
        }

        System.out.println();
    }
}
