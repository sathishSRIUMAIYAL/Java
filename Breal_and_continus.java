import java.util.Scanner;

public class Breal_and_continus{
    public static void main(String[] args) {
        Scanner output = new Scanner(System.in);
        int day=output.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
        
            default:
            System.out.println("Invalid day");
                break;
        }

      


        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue;
            }
            System.out.println(i);
          }  



    }
}