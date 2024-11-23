import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome test, please enter some text: ");
        String text = scanner.nextLine().trim();

        String normalizedText = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversedText = new StringBuilder(normalizedText).reverse().toString();
       
        System.out.println(text + (normalizedText.equals(reversedText) ? " is a palindrome" : " is not a palindrome"));
        
        scanner.close();

    }
}