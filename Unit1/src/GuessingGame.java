import java.util.Scanner;

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

        System.out.println("Hello player!");
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the player's name? ");
        String player = scan.nextLine();
        System.out.println(player);
    }

}
