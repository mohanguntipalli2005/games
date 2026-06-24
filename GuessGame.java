import java.util.*;

public class GuessGame {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        while (true) {

            System.out.print("Do you want to play? (yes/no): ");
            String s = sc.next();

            if (!s.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing!");
                break;
            }

            int randomNum = rand.nextInt(100) + 1;
            int count = 0;

            while (true) {

                System.out.print("Enter a number (1-100): ");
                int num = sc.nextInt();
                count++;

                if (num > 100 || num < 1) {
                    System.out.println("Number out of range!");
                }
                else if (num == randomNum) {
                    System.out.println("---Congratulations!---");
                    System.out.println("You guessed it in " + count + " attempts.");
                    break;
                }
                else if (num > randomNum) {
                    System.out.println("Try a smaller number!");
                }
                else {
                    System.out.println("Try a larger number!");
                }
            }
        }

        sc.close();
    }
}