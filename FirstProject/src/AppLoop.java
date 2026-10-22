import java.util.Scanner;

/**
 * A Program to print out a a defined input from the terminal 10 times.
*/
public class AppLoop {

    private final static int DISPLAY_NO = 10;
    /**
     * Asks for an input to the terminal and prints it back to the terminal 10 times.
     * 
     * @param args - no arguments
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie etwas ein: ");
        String input = scanner.nextLine();
        //int number = scanner.nextInt();

        for (int i = 0; i < DISPLAY_NO; i++) {
            System.out.println(input);
        }

        scanner.close();
    }
}