public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String ColonyName = "Ganymede";
        int ShipPopulation = 300;
        double ShipFood = 4000.00;
        boolean Landing = true;
        //Upon reaching Mars everyone will eat 0.75 meals a day, to preserve food
        //calculate food left after landing (takes 2 days)
        ShipFood = ShipFood - (ShipPopulation * 0.75);
        ShipFood = ShipFood - (ShipPopulation * 0.75);
        System.out.println(ShipFood);

        //after extra crate of food (50%)
        ShipFood = ShipFood + (ShipFood * 0.50);
        //after birth of 5 babies
        ShipPopulation = ShipPopulation + 5;

        //Create a String value called LandingLocation and set it equal to "The Hill" or "The Plain" or "The Ocean"
        String LandingLocation = "The Hill";
        //Create an if-else statement. That checks to see if the LandingLocation is equal to “The Plain” ignoring case
        if (LandingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        //Call a function called LandingCheck() that has a parameter of 100, returns boolean, and set it equal to Landing
        Landing = LandingCheck(100);
        new GuessingGame();
    }
    //Create a public static void function called LandingCheck with an int parameter called Loops
    public static boolean LandingCheck(int Loops) throws InterruptedException {
        //Create a for loop that starts at i = 0, loops until i is equal to Loops, and i increments by 1 each loop
        for (int i = 0; i <= Loops; i++) {
            if ((i % 3) == 0 && (i % 5) == 0) {
                System.out.println("Keep Center");
            } else if ((i % 5) == 0) {
                System.out.println("Right");
            } else if ((i % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }

}
