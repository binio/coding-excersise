import java.util.Scanner;

public class ConsoleApp {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the Consecutive string App *");
        System.out.println("*****************************************");
        System.out.println("Enter \"Q\" to Quit");
        System.out.println("Enter \"out \" print max consecutive number");

        ConsecutiveApp consecutiveApp = new ConsecutiveApp();

        while (true) {
            String inputValue = scanner.next();

            if (inputValue.startsWith("out")) {
                consecutiveApp.outputResults();

            } else if ("Q".equalsIgnoreCase(inputValue)) {
                System.out.println("Thanks for your time!");
                System.exit(0);
            }
        }


    }
}
