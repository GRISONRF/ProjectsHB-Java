import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition(){

        Scanner input = new Scanner(System.in);
        System.out.println("Expedition starting.... \n Loading \n ..... \n ..... \n READY");

        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println("Hello " + name + ", welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String yN = input.nextLine();
        if (yN.equals("y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else if (yN.equals("n")) {
            System.out.println("Too bad you are team leader. You have to go.");
        }
        System.out.println("How many people do you want in your team?");
        int team = input.nextInt();
        if (team > 2){
            System.out.println("That’s way to many people. We can only send 2 more members.");
            team = 2;
        } else if (team < 2) {
            System.out.println("That's not enough people! You need to have a team of 3 total.");
            team = 2;
        } else if (team == 2) {
            System.out.println("That's a perfect sized team. Good job.");
        }

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + " with you.");

    }
}
