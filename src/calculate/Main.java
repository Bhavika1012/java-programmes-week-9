package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner object for user input
        Calculator calculator = new Calculator(); //Creating object to call instance method
        char choice;
        do { //Using while loop for user inputs
            System.out.print("Enter first number: ");
            int a = scanner.nextInt(); //reading user input
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();
            System.out.print("Please enter one of symbol +,-,*, /: ");
            char symbol = scanner.next().charAt(0);

            //Calling the "calculateResult" method to perform the operation
            calculator.calculateResult(a, b, symbol);

            // Ask user if they want to perform another calculation
            System.out.print("Would you like to do more calculations? Enter Y or N: ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y'); //if user enters 'y' loop will occur again, if N then it will terminate.
        scanner.close();
    }
}
