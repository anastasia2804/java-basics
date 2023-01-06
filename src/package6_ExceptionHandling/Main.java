package package6_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number to divide: ");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int secondNumber = scanner.nextInt();

            int result = firstNumber / secondNumber;

            System.out.println("The result: " + result);
        }
        catch(InputMismatchException e) {
            System.out.println("Please enter a NUMBER");
        }
        catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        finally {
            scanner.close();
        }
    }
}