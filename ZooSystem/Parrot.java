import java.util.Scanner;
import java.util.Random;

class Parrot extends Bird {
    public String parrotType;

    Parrot(String name) {
        super(name);
        this.parrotType = "amazon";
        this.setSpecies("Parrot");
        this.setConservationStatus("Not Extinct");
        this.setEatingHabits("Omnivores");
        this.setFeatherColor("All Colors");
        this.setBeakShape("Short and Conical");
        this.setEggSize(25);
    }

    Parrot(String name, String parrotType) {
        super(name);
        this.parrotType = parrotType;
        this.setSpecies("Parrot");
        this.setConservationStatus("Not Extinct");
        this.setEatingHabits("Omnivores");
        this.setFeatherColor("All Colors");
        this.setBeakShape("Short and Conical");
        this.setEggSize(25);
    }

    public void copyVoice() {
        Scanner scanVoice = new Scanner(System.in);
        System.out.println("Please say something: ");
        String sentence = scanVoice.nextLine();
        System.out.println(this.getName() + " says: " + sentence);
    }

    public void makeSound() {
        System.out.println("Make sound: tweet, tweet");
    }

    public void eat() {
        System.out.println("Eat: " + this.getName() + " enjoys fruit, seeds, and nuts.");
    }

    public void spawn() {
        System.out.println("Spawn: baby parrot comes from eggs.");
    }

    public void featherMolting() {
        System.out.println(this.getName() + " molts old, worn out feathers shortly after the breeding season.");
    }

    public void layEggs() {
        Random rand = new Random();
        int n = rand.nextInt(4) + 1;
        System.out.println(this.getName() + " has just layed " + Integer.toString(n) + " eggs. Each is " + Double.toString(this.getEggSize()) + " unit big.");
    }

    public void changeFeatherColor() {
        System.out.println("Parrots don't naturally change colors, but they do grow into their colors as they age.");
    }

    public void fly() {
        System.out.println(this.getName() + " is flying.");
    }

    public void displayinfo() {
        System.out.println(this.getName() + " is a happy " + this.parrotType + " " + this.getSpecies() + ".");
        this.makeSound();
        this.eat();
        this.spawn();
        this.featherMolting();
        this.changeFeatherColor();
        this.fly();
        this.layEggs();
        this.copyVoice();
    }
}
