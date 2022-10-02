/*
 * SNHU IT-145
 * 5-4 Milestone: Menu loop and monkey intake
 * Driver.java
 * Professor Mahendra Gossai
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    // ArrayList for dogs
    
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // ArrayList for monkeys
    private static ArrayList<Monkey>monkeyList = new ArrayList<Monkey>();
    // scanner created here to use everywhere 
    private static Scanner scnr = new Scanner(System.in);
    // Instance variables (if needed)
    
    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        while(true) {
            displayMenu();
            String menuOption = scnr.nextLine(); // get menu option from user
            switch(menuOption) {
                case "1":
                    intakeNewDog(scnr);
                    System.out.println("\n\nThis dog is already in our system\n\n");
                    break;
                case "2":
                    intakeNewMonkey(scnr);
                    break;
                case "3":
                    reserveAnimal(scnr);
                    break;
                case "4": // prints a list of all dogs stored in the system
                    printAnimals();
                    break;
                case "5": // prints a list of all monkeys stored in the system
                    printAnimals();
                    break;
                case "q": // quits application
                    System.out.println("Goodbye, ");
                    System.out.println("Thank you for using the Grazioso Salvare animal check in system.");
                    System.exit(0);
                    break;
            }
        }

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scnr) {
            System.out.println("What is the name of this monkey?");
            String name = scnr.nextLine();
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; // returns to menu
                }
            }
            System.out.println("The method intakeNewMonkey needs to be implemented");
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("The method reserveAnimal needs to be implemented");

        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals() {
            System.out.println("The method printAnimals needs to be implemented");
        }
}
 

