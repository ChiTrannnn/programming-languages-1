import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allNames = "";

        while (true) {
            System.out.print("Enter a name: ");
            String name = scanner.next();

            if(name.equalsIgnoreCase("Quit")) {
                break;
            }
            allNames = allNames.concat(name);
            System.out.println(allNames);
        }        
         scanner.close();
}
}