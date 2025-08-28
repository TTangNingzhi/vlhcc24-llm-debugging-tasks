abstract class Animal {
    private String name;
    private String species;
    private String conservationStatus;
    private int chambersInHeart;
    private String eatingHabits;
    private String bloodType;

    Animal(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getSpecies() {
        return species;
    }

    public final void setSpecies(String species) {
        this.species = species;
    }

    public final String getConservationStatus() {
        return conservationStatus;
    }

    public final void setConservationStatus(String conservationStatus) {
        this.conservationStatus = conservationStatus;
    }

    public final int getChambersInHeart() {
        return chambersInHeart;
    }

    public final void setChambersInHeart(int chambersInHeart) {
        this.chambersInHeart = chambersInHeart;
    }

    public final String getEatingHabits() {
        return eatingHabits;
    }

    public final void setEatingHabits(String eatingHabits) {
        this.eatingHabits = eatingHabits;
    }

    public final String getBloodType() {
        return bloodType;
    }

    public final void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public abstract void makeSound();

    public abstract void eat();

    public abstract void spawn();

    public abstract void displayinfo();

}

