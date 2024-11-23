import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.next();
        System.out.println("You entered: " + name);

        for (int i = name.length() - 1; i >= 0; i--) {
            if ( i%2 == 0) { // beacause l, u, s are in even position 0,2,4, respectively
                System.out.println(name.charAt(i));
            }
            
        }
        scanner.close();    }
}