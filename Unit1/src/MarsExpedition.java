import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition(){

        Scanner input = new Scanner(System.in);
        System.out.println("Expedition starting.... \n Loading \n ..... \n ..... \n READY");

        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println("Hello " + name + ", welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String yN = input.nextLine();
        if (yN.equalsIgnoreCase("y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else if (yN.equalsIgnoreCase("n")) {
            System.out.println("Too bad you are team leader. You have to go.");
        }
        System.out.println("How many people do you want in your team?");
        int team = input.nextInt();
        if (team > 2) {
            System.out.println("That’s way to many people. We can only send 2 more members.");
            team = 2;
        } else if (team < 2) {
            System.out.println("That's not enough people! You need to have a team of 3 total.");
            team = 2;
        } else if (team == 2) {
            System.out.println("That's a perfect sized team. Good job.");
        }

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        input.nextLine();
        String snack = input.nextLine();
        input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + " with you.");

        System.out.println("You have the choice of 3 vehicles" +
                "\nA: A Mars Rover" +
                "\nB: A Chevy Silverado" +
                "\nC: A Honda Civic \n Pick one. ");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("A")) {
            choice = " a Mars Rover";
        } else if (choice.equalsIgnoreCase("B")) {
            choice = " a Chevy Silverado";
        } else if (choice.equalsIgnoreCase("C")) {
            choice = " a Honda Civic";
        } else {
            choice = "your feet";
        }

        System.out.println("Hello " + name + "!" +
                "\n Your team have a size of " + team + ", you are bringing " + snack + " with you, and you are going with " + choice + "." +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1....");
    }
}
