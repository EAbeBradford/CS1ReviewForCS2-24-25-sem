// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int paramNumberOfCups, String paramFalvor, boolean paramHasWhippedCream) {
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        numberOfCups = paramNumberOfCups;
        flavor = paramFalvor;
        hasWhippedCream = paramHasWhippedCream;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        // Make this method print order details.
        // Include information stored in each variable.
        System.out.println("Coffe order: ");
        System.out.println("# cups: "+ numberOfCups);
        System.out.println("flavor: "+ flavor);
        System.out.println("whipped cream?: "+ hasWhippedCream);

    }
}
