class Hippo extends Mammal {
    public String hippoType;
    public boolean bulletProof;
    public double biteStrength;

    Hippo(String name) {
        super(name);
        this.hippoType = "river";
        this.bulletProof = true;
        this.biteStrength = 1000;

        this.setSpecies("Hippo");
        this.setConservationStatus("Vulnerable");
        this.setEatingHabits("Herbivore");
        this.setFurColor("Bald");
    }

    Hippo(String name, String hippoType, boolean bulletProof, double biteStrength) {
        super(name);
        this.hippoType = hippoType;
        this.bulletProof = bulletProof;
        this.biteStrength = biteStrength;

        this.setSpecies("Hippo");
        this.setConservationStatus("Vulnerable");
        this.setEatingHabits("Herbivore");
        this.setFurColor("Bald");
    }

    public void swim() {
        System.out.println(this.getName() + " is swimming.");
    }

    public void earWiggle() {
        System.out.println(this.getName() + " is wiggling its ears.");
    }

    public void makeSound() {
        System.out.println("Make sound: honks, grunts, roars, squeals, and wheezing.");
    }

    public void eat() {
        System.out.println("Eat: " + this.getName() + " eats grass, leaves and roots of forest plants, fruits and ferns.");
    }

    public void spawn() {
        System.out.println("Spawn: baby hippos are calves. They come to the world from their mom's body.");
    }

    public void liveBirth() {
        System.out.println(this.getName() + " and its partner have just got 1 new baby.");
    }

    public void sweat() {
        System.out.println("Hippos have special glands that secrete a substance called blood sweat.");
    }

    public void shedFur() {
        System.out.println("Hippos don't really have furs");
    }

    public void displayinfo() {
        System.out.print(this.getName() + " is a happy " + this.hippoType + " " + this.getSpecies() + ". ");
        if (this.bulletProof) {
            System.out.print("It has a super thick bulletproof skin. ");
        }
        System.out.print("Its bite streangth is " + Double.toString(this.biteStrength) + ".\n");
        this.makeSound();
        this.eat();
        this.spawn();
        this.liveBirth();
        this.shedFur();
        this.swim();
        this.earWiggle();
    }
}
