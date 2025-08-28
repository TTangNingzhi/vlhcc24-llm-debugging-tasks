import java.util.Scanner;
import java.util.Random;

public class ZooSystem {

    public static void setupAnimals() {
        // create the zoo list of animals

        Animal[] alist = new Animal[6];

        alist[0] = new Lion("Daisy");

        alist[1] = new Hippo("Marlee");

        alist[2] = new Crocodile("Jawsy");

        alist[3] = new Chameleon("Fido");

        alist[4] = new Penguin("Shamu");

        alist[5] = new Parrot("Bagheera");

        System.out.println("\n");

        System.out.println("Set animals");

        printSummaryView(alist);

        printVerboseList(alist);

        printOptions(alist);

    }

    static Animal[] addAnimal(String species, String name, Animal[] alist) {

        Animal[] alistNew = new Animal[alist.length + 1];

        for (int i = 0; i < alist.length; i++) {
            alistNew[i] = alist[i];
        }

        if (species.equals("Lion")) {
            Scanner scanChoice = new Scanner(System.in);
            System.out.print("Do you want to add more detail? (y/n): ");
            if (scanChoice.next().equals("n")) {
                alistNew[alist.length] = new Lion(name);
            } else {
                Scanner scanManeSize = new Scanner(System.in);
                System.out.print("Mane size (feet): ");
                double maneSize = Double.parseDouble(scanManeSize.next());
                Scanner scanColorOfMane = new Scanner(System.in);
                System.out.print("Color of mane: ");
                String maneColor = scanColorOfMane.next();
                Scanner scanType = new Scanner(System.in);
                System.out.print("Lion type: ");
                String lionType = scanType.next();
                alistNew[alist.length] = new Lion(name, maneSize, maneColor, lionType);
            }

        }

        if (species.equals("Hippo")) {
            Scanner scanChoice = new Scanner(System.in);
            System.out.print("Do you want to add more detail? (y/n): ");
            if (scanChoice.next().equals("n")) {
                alistNew[alist.length] = new Hippo(name);
            } else {
                Scanner scanBite = new Scanner(System.in);
                System.out.print("Bite Strength: ");
                double bite = Double.parseDouble(scanBite.next());

                Scanner scanBP = new Scanner(System.in);
                System.out.print("Is it bulletproof? (y/n): ");
                String answer = scanBP.next();
                boolean bp = true;
                if (answer.equals("n")) {
                    bp = false;
                }

                Scanner scanType = new Scanner(System.in);
                System.out.print("Hippo type: ");
                String hippoType = scanType.next();
                alistNew[alist.length] = new Hippo(name, hippoType, bp, bite);
            }
        }

        if (species.equals("Crocodile")) {
            Scanner scanChoice = new Scanner(System.in);
            System.out.print("Do you want to add more detail? (y/n): ");
            if (scanChoice.next().equals("n")) {
                alistNew[alist.length] = new Crocodile(name);
            } else {
                Scanner scanType = new Scanner(System.in);
                System.out.print("Crcodile Type: ");
                String type = scanType.next();
                alistNew[alist.length] = new Crocodile(name, type);
            }
            alistNew[alist.length] = new Crocodile(name);

        }

        if (species.equals("Chameleon")) {
            Scanner scanChoice = new Scanner(System.in);
            System.out.print("Do you want to add more detail? (y/n): ");
            if (scanChoice.next().equals("n")) {
                alistNew[alist.length] = new Chameleon(name);
            } else {
                Scanner scanType = new Scanner(System.in);
                System.out.print("Chameleon Type : ");
                String type = scanType.next();
                alistNew[alist.length] = new Chameleon(name, type);
            }
        }

        if (species.equals("Penguin")) {
            Scanner scanChoice = new Scanner(System.in);
            System.out.print("Do you want to add more detail? (y/n): ");
            if (scanChoice.next().equals("n")) {
                alistNew[alist.length] = new Penguin(name);
            } else {
                Scanner scanFlipperSize = new Scanner(System.in);
                System.out.print("Flipper size (mm): ");
                double fsize = Double.parseDouble(scanFlipperSize.next());

                Scanner scanFeetColor = new Scanner(System.in);
                System.out.print("Feet color: ");
                String feetColor = scanFeetColor.next();

                Scanner scanType = new Scanner(System.in);
                System.out.print("Penguin type: ");
                String penguinType = scanType.next();
                alistNew[alist.length] = new Penguin(name, penguinType, fsize, feetColor);
            }
        }

        if (species.equals("Parrot")) {
            Scanner scanChoice = new Scanner(System.in);
            System.out.print("Do you want to add more detail? (y/n): ");
            if (scanChoice.next().equals("n")) {
                alistNew[alist.length] = new Parrot(name);
            } else {
                Scanner scanType = new Scanner(System.in);
                System.out.print("Parrot Type : ");
                String type = scanType.next();
                alistNew[alist.length] = new Parrot(name, type);
            }
        }

        alist = alistNew;

        printSummaryView(alist);

        printVerboseList(alist);

        return alist;


    }


    static Animal[] deleteAnimal(int index, Animal[] alist) {

        Animal[] alistNew = new Animal[alist.length - 1];

        int shiftDelete = 0;

        for (int i = 0; i < alist.length; i++) {

            if (i != index) {

                alistNew[i - shiftDelete] = alist[i];

            }

            if (i == index) {

                shiftDelete = 1;

            }

        }

        alist = alistNew;

        printSummaryView(alist);

        printVerboseList(alist);

        return alist;

    }


    static void displayAnimal(String name, Animal[] alist) {

        for (int i = 0; i < alist.length; i++) {

            if (alist[i].getName().equals(name)) {

                alist[i].displayinfo();

                break;

            }

        }

        printSummaryView(alist);

        printVerboseList(alist);

    }


    /*
     Task 3.3: Copilot wrote a function called `searchAnimal(String  attribute, String  value, Animal[] alist)` 
     to search for all the animals that matches the given `value` of the `attribute` 
     (e.g. `Name`, `Species`, `Conservation Status`, `Heart Chambers`, `Eating Habits`) 
     After getting all the animals, it will display them by calling `printVerboseList(Animal[] list)` function.
     */
    /* COPILOT CODE STARTS HERE */
    static void searchAnimal(String attribute, String value, Animal[] alist) {
        // initialize a new array to store the animals with the given attribute
        Animal[] alistNew = new Animal[alist.length];
        // initialize a counter to count the number of animals with the given attribute
        int count = 0;
        // loop through the array of animals
        for (int i = 0; i < alist.length; i++) {
            // check if the attribute is names
            if (attribute.equals("names")) {
                // check if the name of the animal is the same as the value
                if (alist[i].getName().equals(value)) {
                    // add the animal to the new array
                    alistNew[count] = alist[i];
                    // increase the counter
                    count++;
                }
            }
            // check if the attribute is species
            if (attribute.equals("species")) {
                // check if the species of the animal is the same as the value
                if (alist[i].getSpecies().equals(value)) {
                    // add the animal to the new array
                    alistNew[count] = alist[i];
                    // increase the counter
                    count++;
                }
            }
            // check if the attribute is conservationStatus
            if (attribute.equals("conservationStatus")) {
                // check if the conservationStatus of the animal is the same as the value
                if (alist[i].getConservationStatus().equals(value)) {
                    // add the animal to the new array
                    alistNew[count] = alist[i];
                    // increase the counter
                    count++;
                }
            }
            // check if the attribute is chambersInHeart
            if (attribute.equals("chambersInHeart")) {
                // check if the chambersInHeart of the animal is the same as the value
                if (alist[i].getChambersInHeart() == Integer.parseInt(value)) {
                    // add the animal to the new array
                    alistNew[count] = alist[i];
                    // increase the counter
                    count++;
                }
            }
            // check if the attribute is eatingHabits
            if (attribute.equals("eatingHabits")) {
                // check if the eatingHabits of the animal is the same as the value
                if (alist[i].getEatingHabits().equals(value)) {
                    // add the animal to the new array
                    alistNew[count] = alist[i];
                    // increase the counter
                    count++;
                }
            }
            // check if the attribute is bloodType
            if (attribute.equals("bloodType")) {
                // check if the bloodType of the animal is the same as the value
                if (alist[i].getBloodType().equals(value)) {
                    // add the animal to the new array
                    alistNew[count] = alist[i];
                    // increase the counter
                    count++;
                }
            }
        }
        // print the new array of animals with the given attribute
        printVerboseList(alistNew);
        printSummaryView(alist);
        printVerboseList(alist);
    }
    /* COPILOT CODE ENDS HERE */


    static void printSummaryView(Animal[] alist) {

        int LionNum = 0;

        int HippoNum = 0;

        int CrocodileNum = 0;

        int ChameleonNum = 0;

        int PenguinNum = 0;

        int ParrotNum = 0;


        for (int i = 0; i < alist.length; i++) {

            String currentSpecies;

            if (alist[i].getSpecies().equals("Lion")) {

                LionNum = LionNum + 1;

            }

            if (alist[i].getSpecies().equals("Hippo")) {

                HippoNum = HippoNum + 1;

            }

            if (alist[i].getSpecies().equals("Crocodile")) {

                CrocodileNum = CrocodileNum + 1;

            }

            if (alist[i].getSpecies().equals("Chameleon")) {

                ChameleonNum = ChameleonNum + 1;

            }

            if (alist[i].getSpecies().equals("Penguin")) {

                PenguinNum = PenguinNum + 1;

            }

            if (alist[i].getSpecies().equals("Parrot")) {

                ParrotNum = ParrotNum + 1;

            }

        }

        System.out.print("\n");
        System.out.println("Summary:");

        System.out.println(LionNum + " Lion(s)");

        System.out.println(HippoNum + " Hippo(s)");

        System.out.println(CrocodileNum + " Crocodile(s)");

        System.out.println(ChameleonNum + " Chameleon(s)");

        System.out.println(PenguinNum + " Penguin(s)");

        System.out.println(ParrotNum + " Parrot(s)");

        System.out.println("\n");

    }


    static void printVerboseList(Animal[] alist) {

        //System.out.println("\tName\t\tSpecies\t\tConservation Status\t\tHeart Chambers");

        System.out.printf("%-2.2s %-10.10s %-10.10s %-20.20s %-15.15s %-15.15s %-15.15s%n", " ", "Name", "Species", "Conservation Status", "Heart Chambers", "Blood Type", "Eating Habits");


        for (int i = 0; i < alist.length; i++) {

            //System.out.println((i + 1) + ":\t" + alist[i].getName() + "\t\t" + alist[i].getSpecies() + "\t\t" + alist[i].getConservationStatus()+ "\t\t" + alist[i].getChambersInHeart());

            System.out.printf("%-2.2s %-10.10s %-10.10s %-20.20s %-15.15s %-15.15s %-15.15s%n", (i + 1), alist[i].getName(), alist[i].getSpecies(), alist[i].getConservationStatus(), alist[i].getChambersInHeart(), alist[i].getBloodType(), alist[i].getEatingHabits());


        }

    }


    static void printOptions(Animal[] alist) {

        while (true) {

            Scanner scan = new Scanner(System.in);

            System.out.print("\nType exit at any time to end the program.\nOptions:\nAdd animal (add)\nDelete animal (delete)\nDisplay animal (display)\nSearch for animal (search)\n");

            String zooInput = scan.next();

            if (zooInput.equals("exit")) {

                break;

            }

            if (zooInput.equals("add")) {

                Scanner scanAddSpecies = new Scanner(System.in);

                System.out.print("What animal would you like to add to the zoo?\nPlease enter the species (Ex: Lion, Hippo, Crocodile, Chameleon, Penguin, Parrot): ");

                String zooInputAddSpeceies = scanAddSpecies.next();

                Scanner scanAddName = new Scanner(System.in);

                System.out.print("Please enter the name (Ex: Bob, Alex, Spot): ");

                boolean f = true;
                String zooInputAddName = "";

                while (f) {
                    f = false;
                    zooInputAddName = scanAddName.next();
                    for (int i = 0; i < alist.length; i++) {
                        if (alist[i].getName().equals(zooInputAddName)) {
                            System.out.print("It is a duplicate. Please type a new one: ");
                            f = true;
                            break;
                        }
                    }
                }

                alist = addAnimal(zooInputAddSpeceies, zooInputAddName, alist);

            }

            if (zooInput.equals("delete")) {

                Scanner scanDelete = new Scanner(System.in);

                System.out.print("What animal would you like to add to delete?\nPlease enter the index:\nEx: 1-" + (alist.length));

                int zooInputDelete = scanDelete.nextInt() - 1;

                alist = deleteAnimal(zooInputDelete, alist);

            }

            if (zooInput.equals("display")) {

                Scanner scanDisplay = new Scanner(System.in);

                System.out.print("What animal would you like to display information aobut?\nPlease enter the name: ");

                displayAnimal(scanDisplay.next(), alist);

            }

            /* Task 3.3 (continued): 
            Copilot add a new option "search" that 
            allows the user to search for animals matches a specific value of any attributes
            by calling `searchAnimal(String  attribute, String  value, Animal[] alist)`.
            */
            /* COPILOT CODE STARTS HERE */
            if (zooInput.equals("search")) {
                Scanner scanSearch = new Scanner(System.in);
                System.out.print("What attribute would you like to search by?\nPlease enter the attribute (Ex: Name, Species, Conservation Status, Heart Chambers, Blood Type, Eating Habits): ");
                String attribute = scanSearch.next();
                System.out.print("What value would you like to search for?\nPlease enter the value: ");
                String value = scanSearch.next();
                searchAnimal(attribute, value, alist);

            }
            /* COPILOT CODE ENDS HERE */

        }

    }

    public static void main(String[] args) {

        setupAnimals();

    } // end of main function

} // end of ZooSystem class

