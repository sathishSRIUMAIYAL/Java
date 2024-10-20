//Data type is a statically type language meaning you must declare all variable type before they can be used this helps catch errors at compile time.

/*

Data type
1.	Primitive data types 
2.	Reference / Data Object Type

1.Primitive data types.
    (Byte, short, int, long) Number
    (Float, double) Binary value  
    Boolean 
    Char

2.Reference / Data Object Type
    String
    Array
    Class objects



 */


public class Data_Type {
    public static void main(String[] args) {

        // 1.Primitive data types.

        // These are using Integar value 


        int Number1=200;                            // Stores whole numbers from -2,147,483,648 to 2,147,483,647
        byte Number2=127;                           // Stores whole numbers from -128 to 127
        short Number3=5000;                         // Stores whole numbers from -32,768 to 32,767
        long Number4=54645;                         // Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
 

        System.out.println(Number1);
        System.out.println(Number2);
        System.out.println(Number3);
        System.out.println(Number4);


        // Binary value  

        float Number5=5.45f;                     // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits  
        double Number6=45454;                    // Stores fractional numbers. Sufficient for storing 15 decimal digits

        System.out.println(Number5);
        System.out.println(Number6);


        // Boolean

        boolean Age=true;                         // Stores true or false values
        boolean weight =false;

        System.out.println(Age); 
        System.out.println(weight);


        // char   

        char myGrade = 'B';                     // Stores a single character/letter or ASCII values

        System.out.println(myGrade);

//----------------------------------------------------------------------------------------------------------------------

        // 2.Reference / Data Object Type

        /*

        Non-primitive data types are called reference types because they refer to objects.
        The main difference between primitive and non-primitive data types are:

        1. Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
        2. A primitive type always has a value, while non-primitive types can be null.
        3. A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
        4. Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. You will learn more about these in a later chapter. 

         */



        // String 

        /*
        String are used for stroing text.
        A String variable contains a collection of characters surrounded by double quotes:

         */

         String letter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         System.out.println(letter);
         System.out.println(letter.length());    // the length of a string can be found with the length() method:

         String name="sathishkumar";
         System.out.println(name.toUpperCase());  // There are many string methods available, for example toUpperCase() and toLowerCase():

         String word ="hi i am sathishkumar this is me";  // The indexOf() method returns the index (the position) of the first      occurrence of a specified text in a string (including whitespace):
         System.out.println(word.indexOf("am"));


         String firstName = "sathish";
         String lastName = "umaiyal";
         System.out.println(firstName+" "+lastName);
         System.out.println(firstName.concat(lastName));

         String x = "10";
         int y = 20;
         String z = x + y; 
         System.out.println(z);    // it will string


         // Strings - Special Characters


         String characters="sathishk\nkumar";
         System.out.println(characters);







    }
    
}
