import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingList {

    public FindingList() throws InterruptedException {

        Thread.sleep(500);
        System.out.println("Welcome back!");

        ArrayList<String> rocks = new ArrayList<String>();
        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");
        System.out.println("Everything dowloaded: \n " + rocks );

        System.out.println("There is a non rock in the list! We will have to delete it");
        rocks.remove("not rock");
        System.out.println(rocks + " Perfect.");

        Thread.sleep(1000);

        HashMap<String, String> attributes = new HashMap<String, String>();

        attributes.put("Bird Fossil","The fossil has wings implying it was capable of flight");
        attributes.put("Fish Fossil","The fossil is vaguely fish shaped implies there was once water");
        attributes.put("Tooth Fossil","The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded.");


        Scanner scan = new Scanner(System.in);
        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth");
        String fossilChoice = scan.nextLine();

        if (fossilChoice.equalsIgnoreCase("bird")) {
            System.out.println(attributes.get("Bird Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("fish")) {
            System.out.println(attributes.get("Fish Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("tooth")) {
            System.out.println(attributes.get("Tooth Fossil"));
        } else {
            System.out.println("Sorry, invalid fossil!");
        }


        Thread.sleep(700);

        HashSet<String> supplies = new HashSet<String>();

        supplies.add("Spoon");
        supplies.add("Rubber Duck");
        supplies.add("Light Bulb");
        System.out.println("These are your Supplies Before Expedition: " + supplies);
        /*
         or
        Iterator itr = supplies.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
       */



        supplies.remove("Spoon");
        System.out.println("Supplies After Expedition");

    }

}
