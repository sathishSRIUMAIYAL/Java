// In Java, the if-else statement is used to perform conditional operations. The if statement checks a condition, and if that condition is true, it executes a block of code. If the condition is false, the else block (if present) is executed.

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int Age=input.nextInt();

        if (Age>18){
            System.out.println("Your are eligible to vote");
        }

        else if(Age<18){
            System.out.println("You not eligible to vote");

        }

        else{
            System.out.println("Enter you currect Age ");
        }

    /*
    Short Hand if...else
    There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.
    It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:
     */


     int time=10;
     String output=(time<18)?"Good morning":"Good evening";
     System.out.println(output);
        
    }

   


}
