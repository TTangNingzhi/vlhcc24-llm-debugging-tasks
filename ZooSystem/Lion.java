class Lion extends Mammal {
    public double maneSize;
    public String colorOfMane;
    public String lionType;
 
   /*
   Task3.2: Copilot created two constructors for the Lion class that takes in the following parameters:
   one only takes name as input,
   the other takes name, maneSize, colorOfMane and lionType as input.
   Please find the bug in the method and fix it.
   Default value:
        species="Lion"
        sonservationStatus="Vulnerable"
        eatingHabits="Carnivore"
        furColor="Yellow-Gold"
        maneSize=1.5
        colorOfMane="Brown"
        lionType="Barbary"
   */

    /* COPILOT CODE STARTS HERE */
    Lion(String name) {
        super(name);
        this.maneSize = 0.0;
        this.colorOfMane = "brown";
        this.lionType = "African";
        this.setSpecies("Lion");
        this.setConservationStatus("Not Extinct");
        this.setEatingHabits("Carnivores");
        this.setFeatherColor("All Colors");
        this.setBeakShape("Short and Conical");
        this.setEggSize(25);
    }

    Lion(String name, double maneSize, String colorOfMane, String lionType) {
        super(name);
        this.maneSize = maneSize;
        this.colorOfMane = colorOfMane;
        this.lionType = lionType;
        this.setSpecies("Lion");
        this.setConservationStatus("Not Extinct");
        this.setEatingHabits("Carnivores");
        this.setFeatherColor("All Colors");
        this.setBeakShape("Short and Conical");
        this.setEggSize(25);
    }
    /* COPILOT CODE ENDS HERE */


    public void chasePrey() {
        System.out.println(this.getName() + " is chasing a poor zebra. Let's see who will win/survive.");
    }

    public void makeSound() {
        System.out.println("Make sound: roar, growl, snarl");
    }

    public void eat() {
        System.out.println("Eat: " + this.getName() + " eats medium-sized to large hoofed animals like wildebeests, zebras, and antelopes.");
    }

    public void spawn() {
        System.out.println("Spawn: baby lions are cubs. They come to the world from their mom's body.");
    }

    public void liveBirth() {
        System.out.println(this.getName() + " and its partner have just got 1 new baby.");
    }

    public void sweat() {
        System.out.println("What a hot day! " + this.getName() + " is sweating. It's looking for a cool place.");
    }

    public void shedFur() {
        System.out.println("Male lions tend to shed their manes after a loss in combat.");
    }

    public void displayinfo() {
        System.out.print("\n");
        System.out.print(this.getName() + " is a happy " + this.lionType + " lion. ");
        System.out.print(this.getName() + " has a " + Double.toString(this.maneSize) + "-feet long " + this.colorOfMane + " mane.\n");
        System.out.print("Here are its behaviors: \n");
        this.makeSound();
        this.eat();
        this.spawn();
        this.shedFur();
        this.liveBirth();
        this.sweat();
        this.chasePrey();
    }
}

