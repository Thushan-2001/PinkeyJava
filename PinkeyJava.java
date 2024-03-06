ackage pinkey.java;




 public class PinkeyJava{
     
    // Instance variables
    private String blinkey;
    private String monkeys;

    // Default constructor
    public PinkeyJava(String pinkey, String donkey, String monkeys, double value) {
        // Setting values to instance variables
        this.blinkey = pinkey;
        this.monkeys = donkey + " " + monkeys + " " + value;

        // Printing the desired statements
        System.out.println("Pinkey " + donkey + " Statement 1");
        System.out.println(donkey + " " + monkeys + " 5.2");
        System.out.println("Pinkey " + donkey + " " + monkeys + " 5.3");
    }


    // Constructor
    public PinkeyJava() {
        // Creating a local variable inside the main method
        String pinkey = "donkey";

        // Printing variable pinkey
        System.out.println("Variable pinkey: " + pinkey);

        // Creating another variable inside the constructor
        String blinkey = pinkey;
        System.out.println("Variable blinkey: " + blinkey);

        // Creating another variable inside the constructor
        String monkeys = "monkey";

        // Calling the parameterized constructor with the created variables
        new PinkeyJava(pinkey, blinkey, monkeys, 5.3);
    }

    public static void main(String[] args) {
        // Creating an object of Pinkey
        PinkeyJava pomkey = new PinkeyJava();
    }
}
