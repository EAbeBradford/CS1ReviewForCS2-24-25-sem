import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence\
        yearFounded = 1;
        System.out.println("We were founded in " + yearFounded + ".");


        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("Milk");
        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects

        // TODO
        // Print out the order details


    }

    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
        int dicount = (int)(Math.random()*31);
        System.out.println("you have recieved a " +dicount + "% discount");
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String special) {
        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        System.out.println("today's special is " + special);
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // TODO
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5
        for(int d = 1; d<=5; d++){
            System.out.println(d);
        }
        System.out.println();
        // Print 2, 5, 8, 11
        for(int x = 2; x <=11 ; x = x+3){
            System.out.print(x );
            if(x< 11){
                System.out.print( ", ");
            }
        }
        System.out.println("\n");

        // Print 8 to 0
        for(int i = 8 ; i>=0; i-- ){
            System.out.println(i);
        }

    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO
        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.
        double bradford = Math.random();
        if(bradford < .25 ){
            System.out.println("water");
        } else if (bradford< .5) {
            System.out.println("Chocolate milk");
        } else if (bradford < .75){
            System.out.println("apple juice");
        } else {
            System.out.println("lemmonade");
        }
    }
}

