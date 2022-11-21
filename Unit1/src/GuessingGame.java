import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

        System.out.println("Hello player! \n What is your name? ");

        Scanner input = new Scanner(System.in);
        String player = input.nextLine();

        Random rand = new Random();
        //call method nextInt and pass in upper range bound. https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/Random.html
        int number = rand.nextInt(100);

        System.out.println(player + " pick a number between 0 - 100: ");

        int tries = 0;

        while (true) {
            int guess = 0;
            try {
                guess = input.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = input.next();
                System.out.println("This is not a valid number. Try again.");
            }
            if (guess > 100 || guess < 1) {
                System.out.println("This number is out of range. Please peak a number between 0 and 100.");
                continue;
            }

            tries = tries + 1;
            if (guess > number) {
                System.out.println("Your guess is too high, pick a new number: ");
            } else if (guess < number){
                System.out.println("This number is too low, pick a new number: ");
            } else {
                System.out.println("Congratulations, you guessed right!");
                System.out.println("It took you " + tries + " tries.");
                break;
            }
        }


    }

}
