import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a password: ");
            String password = scanner.nextLine();

            // the validatePassword method is use to check the password
            // and it returns the string "Pass word is valid" or the opposite.
            // so the validationMessage will hold that value
            String validationMessage = validatePassword(password);

            if (validationMessage.equals("Password is valid.")) {
                System.out.println(validationMessage);
                break; 
            } else {
                System.out.println("Password is invalid. " + validationMessage);
            }
        }

        scanner.close();
    }
    //Chat gpt
    // Method to validate the password and provide specific feedback
    private static String validatePassword(String password) {
        StringBuilder message = new StringBuilder();

        // Check length
        if (password.length() < 8) {
            message.append("Needs to be at least 8 characters long. ");
        }

        // Check for at least one uppercase letter, one lowercase letter, and one digit
        boolean hasUpperCase = false, hasLowerCase = false, hasDigit = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpperCase = true;
            if (Character.isLowerCase(ch)) hasLowerCase = true;
            if (Character.isDigit(ch)) hasDigit = true;
        }

        if (!hasUpperCase) {
            message.append("Needs to include at least one uppercase letter. ");
        }
        if (!hasLowerCase) {
            message.append("Needs to include at least one lowercase letter. ");
        }
        if (!hasDigit) {
            message.append("Needs to include at least one digit. ");
        }

        // Return either the list of requirements or confirm validity
        return message.length() > 0 ? message.toString().trim() : "Password is valid.";
    }
}
