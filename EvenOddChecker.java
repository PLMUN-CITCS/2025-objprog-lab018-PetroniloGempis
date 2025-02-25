import java.util.Scanner;

public class EvenOddChecker {
    
    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        // Validate input
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Discard invalid input
            System.out.print("Enter an integer: ");
        }
        
        int number = scanner.nextInt();
        return number;
    }

    // Method to check if a number is even or odd
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }

    public static void main(String[] args) {
        int userInput = getIntegerInput(); // Get user input
        String result = checkEvenOrOdd(userInput); // Determine even or odd
        System.out.println(result); // Display the result
    }
}
