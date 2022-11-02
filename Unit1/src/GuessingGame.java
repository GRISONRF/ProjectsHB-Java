import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    /*
greet player
get player name
choose random number between 1 and 100
repeat forever:
   get guess
   if guess is incorrect:
      give hint
      increase number of guesses
   else:
      congratulate player  */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Hello player! \n What is your name? ");
        String player = scan.nextLine();

        Random rand = new Random();
        //call method nextInt and pass in upper range bound. https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/Random.html
        int number = rand.nextInt(100);
        System.out.println(number);
        System.out.println(player + " pick a number between 0 - 100: ");
        int guess = scan.nextInt();
        int tries = 0;


        while (true) {
            tries = tries + 1;
            if (guess > number) {
                System.out.println("Your guess is too high, pick a new number: ");
                guess = scan.nextInt();
            } else if (guess < number){
                System.out.println("This number is too low, pick a new number: ");
                guess = scan.nextInt();
            } else {
                System.out.println("Congratulations, you guessed right!");
                System.out.println("It took you " + tries + " tries.");
                break;
            }
        }




    }

}
