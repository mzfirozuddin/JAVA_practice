public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i<10) {
            System.out.print(i+" ");
            i++;
        }


        // This program run infinite time
        // Because here variable alwaya less than 10
       /*  
       int j = 1;   
        while (j<10) {
            System.out.print(i+" ");
        } 
        */

        

        // infinite loop
        /* 
        while (true) {
            // statement
        } 
        */



         // this is also infinite loop
        /* 
        int k = 0;
        while (k < 10);  // It means: while(k < 10){};
        {
            System.out.println(k);
            k++;
        }
         
        */
    }
}




// Syntax:-
/* 
while(condition)
{
    // statement to be execute
    increment/dectement
}
*/