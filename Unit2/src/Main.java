import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public void main(String[] args) {

        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");

        //cupcake
        Scanner input = new Scanner(System.in);
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String priceText  = input.nextLine();
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);

        //redvelvet
        System.out.println("We are deciding on the price for our standard red velvet cupcake. Here is the description:");
        redVelvet.type();
        System.out.println("How much would you like to charge for the red velvet? (Input a numerical number taken to 2 decimal places)");
        String redPriceText  = input.nextLine();
        double redPrice = Double.parseDouble(redPriceText);
        cupcake.setPrice(redPrice);

        //chocolate
        System.out.println("We are deciding on the price for our standard chocolate cupcake. Here is the description:");
        chocolate.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String chocoPriceText  = input.nextLine();
        double chocoPrice = Double.parseDouble(chocoPriceText);
        cupcake.setPrice(chocoPrice);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();

        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        //water
        System.out.println("We are deciding on the price for our drinks. Here is the description:");
        water.type();
        System.out.println("How much would you like to charge for the water? (Input a numerical number taken to 2 decimal places)");
        String wPriceText = input.nextLine();
        double wPrice = Double.parseDouble(wPriceText);
        water.setPrice(wPrice);

        //soda
        System.out.println("We are deciding on the price for our drinks. Here is the description:");
        water.type();
        System.out.println("How much would you like to charge for the soda? (Input a numerical number taken to 2 decimal places)");
        String sPriceText = input.nextLine();
        double sPrice = Double.parseDouble(sPriceText);
        water.setPrice(sPrice);

        //milk
        System.out.println("We are deciding on the price for our drinks. Here is the description:");
        water.type();
        System.out.println("How much would you like to charge for the milk? (Input a numerical number taken to 2 decimal places)");
        String mPriceText = input.nextLine();
        double mPrice = Double.parseDouble(mPriceText);
        water.setPrice(mPrice);


    }

    class Cupcake {

        public double price;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void type() {
            System.out.println("A basic, generic cupcake, with vanilla frosting");
        }
    }

    class RedVelvet extends Cupcake{

        public void type() {
            super.type();
            System.out.println("A red velvet based cupcake, with cream cheese frosting.");
        }
    }

    class Chocolate extends Cupcake{

        public void type() {
            super.type();
            System.out.println("A chocolate based cupcake, with chocolate frosting.");
        }
    }

    class Drink{

        public double price;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price){
            this.price = price;
        }

        public void type(){
            System.out.println("A bottle of water.");;
        }
    }

    class Soda extends Drink{

        public void type(){
            System.out.println("A bottle of soda.");
        }
    }

    class Milk extends Drink{

        public void type(){
            System.out.println("A bottle of  milk.");
        }
    }

}
