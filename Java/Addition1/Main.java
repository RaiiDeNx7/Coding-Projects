package Addition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);
  
         System.out.print("What is " + number1 + " + " + number2 + "? ");
         Scanner input = new Scanner(System.in);

 
         int answer = input.nextInt();
 
        System.out.println(
            number1 + " + " + number2 + " = " + answer + " is " +
            (number1 + number2 == answer));
        

        System.out.println("Thank you for using");
        input.close();
    }
}
