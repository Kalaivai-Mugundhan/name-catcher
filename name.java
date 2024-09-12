import java.util.Scanner;

public class name {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter their first name
            System.out.print("Enter your first name: ");
            String firstName = scanner.nextLine();

            // Prompt the user to enter their last name
            System.out.print("Enter your last name: ");
            String lastName = scanner.nextLine();

            // Display a greeting message with the full name
            System.out.println("Hello, " + firstName + " " + lastName + "!");
        } catch (Exception e) {
            // Handle any unexpected exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the Scanner object to release resources
            scanner.close();
        }
    }
}
