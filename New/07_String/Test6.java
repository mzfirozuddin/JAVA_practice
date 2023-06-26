public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("dcba");

        sb.reverse();
        System.out.println(sb);  //abcd
        
        sb.append("efg");
        System.out.println(sb);     // abcdefg

        sb.setCharAt(1, 'h');
        System.out.println(sb);     // ahcdefg

        sb.delete(0, 2);
        System.out.println(sb);     // cdefg

        sb.insert(1, "xyz");
        System.out.println(sb);     // cxyzdefg


        // same output if we replace StringBuilder with StringBuffer
    }
}


/* 
// Note:- 

StringBuffer and StringBuilder Method:-

Methods same as String:-
    => length(), charAt(index), indexOf(str), indexOf(str, fromIndex), lastIndexOf(str), lastIndexOf(str, fromIndex), compareTo(sb)
       substring(beginIndex), substring(beginIndex, endIndex), chars()

New Method:-
    => append(x) {Here x can be: boolean/int/char/String/float/double/object etc.},
       insert(offset, x) {Here also x can be: boolean/int/char/String/float/double/object etc.},
       setCharAt(index, x), reverse(), deleteCharAt(index), delete(start, end), capacity(), replace(start, end, str)


*/
