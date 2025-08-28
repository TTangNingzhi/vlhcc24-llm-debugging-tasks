import java.util.Random;

class Penguin extends Bird {
    public String penguinType;
    public double flipperSize;
    public String feetColor;

    Penguin(String name) {
        super(name);
        this.penguinType = "King";
        this.flipperSize = 221.54;
        this.feetColor = "black";

        this.setSpecies("Penguin");
        this.setConservationStatus("Not Extinct");
        this.setEatingHabits("Carnivore");
        this.setFeatherColor("Black, White, and Yellow");
        this.setBeakShape("Long and Thin");
        this.setEggSize(120);
    }

    Penguin(String name, String penguinType, double flipperSize, String feetColor) {
        super(name);
        this.penguinType = penguinType;
        this.flipperSize = flipperSize;
        this.feetColor = feetColor;

        this.setSpecies("Penguin");
        this.setConservationStatus("Not Extinct");
        this.setEatingHabits("Carnivore");
        this.setFeatherColor("Black, White, and Yellow");
        this.setBeakShape("Long and Thin");
        this.setEggSize(120);
    }


    public void swim() {
        System.out.println(this.getName() + " is swimming.");
    }

    public void jumpOffCliff() {
        System.out.println("There is a penguin jumping off the cliff. " + this.getName() + " follows it.");
    }

    public void makeSound() {
        System.out.println("Make sound: noot, noot");
    }

    public void eat() {
        System.out.println("Eat: " + this.getName() + " eats fish.");
    }

    public void spawn() {
        System.out.println("Spawn: baby penguin comes from eggs.");
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
        System.out.println("Penguin changes from black and white to black, white and yellow.");
    }

    public void fly() {
        System.out.println("Unfortunately, " + this.getName() + " cannot fly.");
    }

    public void displayinfo() {
        System.out.print(this.getName() + " is a happy " + this.penguinType + " " + this.getSpecies() + ". ");
        System.out.print("Its feet is " + this.feetColor + ". Its flipper size is " + Double.toString(this.flipperSize) + "mm.\n");
        System.out.println("Here are some behaviors:");
        this.makeSound();
        this.eat();
        this.spawn();
        this.featherMolting();
        this.changeFeatherColor();
        this.fly();
        this.layEggs();
        this.swim();
        this.jumpOffCliff();
    }
}
