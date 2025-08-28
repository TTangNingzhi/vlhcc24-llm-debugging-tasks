import java.util.Random;

class Crocodile extends Reptile {
    public String crocodileType;

    Crocodile(String name) {
        super(name);
        this.crocodileType = "true";

        this.setSpecies("Crocodile");
        this.setConservationStatus("Not Extinct");
        this.setEatingHabits("Carnivore");
        this.setScaleColor("Green and Tan");
        this.setEggSize(100);

    }

    Crocodile(String name, String crocodileType) {
        super(name);
        this.crocodileType = crocodileType;
        this.setSpecies("Crocodile");
        this.setConservationStatus("Not Extinct");
        this.setEatingHabits("Carnivore");
        this.setScaleColor("Green and Tan");
        this.setEggSize(100);

    }

    public void swim() {
        System.out.println(this.getName() + " is swimming.");
    }

    public void chomp() {
        System.out.println(this.getName() + " is chompping a piece of wood. We don't know why, but have fun, " + this.getName() + "!");
    }

    public void deathRoll() {
        System.out.println("Crocodiles do a death roll to death roll to disorient their prey, making it difficult for the prey to fight back or escape.");
    }

    public void shedTeeth() {
        System.out.println(" Unlike people, " + this.getName() + "does not clean their teeth to slow down wear and tear. Instead, they get rid of them and replace them with new copies.");
    }

    public void makeSound() {
        System.out.println("Make sound: (Grunt,grunt) gulugulu,hooooo...");
    }

    public void eat() {
        System.out.println("Eat: " + this.getName() + " literally eats everything it encounters... Insects, fish, even lions. Watch out Daisy!");
    }

    public void spawn() {
        System.out.println("Spawn: baby crocodile comes from eggs.");
    }

    public void layEggs() {
        Random rand = new Random();
        int n = rand.nextInt(40) + 20;
        System.out.println(this.getName() + " has just layed " + Integer.toString(n) + " eggs. Each is " + Double.toString(this.getEggSize()) + " unit big.");
    }

    public void shedScales() {
        System.out.println(this.getName() + " is now shedding its scales.\n");
    }

    public void displayinfo() {
        System.out.println(this.getName() + " is a happy " + this.crocodileType + " " + this.getSpecies() + ".");
        this.makeSound();
        this.eat();
        this.spawn();
        this.swim();
        this.chomp();
        this.deathRoll();
        this.shedTeeth();
        this.shedScales();
        this.layEggs();
    }
}
