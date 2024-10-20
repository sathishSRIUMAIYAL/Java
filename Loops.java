/*Loops can execute a block of code as long as a specified condition is reached.

Loops are handy because they save time, reduce errors, and they make code more readable.

 */


public class Loops {
    public static void main(String[] args) {

        //Java While Loop
        // The while loop loops through a block of code as long as a specified condition is true:
        
        int i=0;

        while (i<5){
            System.out.println(i);
            i++;
        }

// --------------------------------------------------------------------------------------------------------------------------------



        /*The Do/While Loop
        The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true. */

        int p = 5;
        do {
           System.out.println(p);
           p--;
        }
        while (p>0);


//-------------------------------------------------------------------------------------------------------------------------------



        /*Java For Loop
        When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop: */

        for (int ok = 0; ok <= 10; ok = ok + 2) {
            System.out.println(ok);
          }  

    }
    
}
