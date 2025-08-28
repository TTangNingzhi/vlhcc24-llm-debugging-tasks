import java.util.Random;

class Chameleon extends Reptile {
    public String chameleonType;

    Chameleon(String name) {
        super(name);
        this.chameleonType = "Jackson's";
        this.setSpecies("Chameleon");
        this.setConservationStatus("Not Extinct");
        this.setEatingHabits("Omnivore");
        this.setScaleColor("All");
        this.setEggSize(1);
    }

    Chameleon(String name, String chameleonType) {
        super(name);
        this.chameleonType = chameleonType;
        this.setSpecies("Chameleon");
        this.setConservationStatus("Not Extinct");
        this.setEatingHabits("Omnivore");
        this.setScaleColor("All");
        this.setEggSize(1);
    }

    /*
     *  Task 3.1: Copilot created a method called changeScaleColor() to set the scale color to a random color and print out the color.
     *  Please find the bug in the method and fix it.
     */
    /* COPILOT CODE STARTS HERE */
    public void changeScaleColor() {
        Random rand = new Random();
        int n = rand.nextInt(7);
        String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        System.out.println(this.getName() + " is now " + colors[n] + ".");
    }
    /* COPILOT CODE ENDS HERE */


    public void launchTongue() {
        System.out.println(this.getName() + " has just launged its tongue.");
    }

    public void makeSound() {
        System.out.println("Make sound: siii huaoooo, siii huaooooo");
    }

    public void eat() {
        System.out.println("Eat " + this.getName() + " is eating a poor grasshopper. Yummy!");
    }

    public void spawn() {
        System.out.println("Spawn: baby chalemeon comes from eggs.");
    }

    public void layEggs() {
        Random rand = new Random();
        int n = rand.nextInt(60) + 20;
        System.out.println(this.getName() + " has just layed " + Integer.toString(n) + " eggs. Each is " + Double.toString(this.getEggSize()) + " unit big.");
    }

    public void shedScales() {
        System.out.println(this.getName() + " is now shedding its scales.");
    }

    public void displayinfo() {
        System.out.println(this.getName() + " is a happy " + this.chameleonType + " " + this.getSpecies() + ".");
        this.makeSound();
        this.eat();
        this.spawn();
        this.launchTongue();
        System.out.println(this.getName() + " is " + this.getScaleColor() + ".");
        this.shedScales();
        this.layEggs();
    }
}
