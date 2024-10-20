
// To get input from a user in Java, you can use the Scanner class from the java.util package.

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner userinput= new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String Name=userinput.nextLine();
        System.out.println("Hello, " + Name + "!");


        
        System.out.println("Enter your Age");
        int Age=userinput.nextInt();
        System.out.println("You age"+Age);
        
    }
}
