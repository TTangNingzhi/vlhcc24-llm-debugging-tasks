abstract class Mammal extends Animal {
    private String furColor;

    Mammal(String name) {//}, String species, String conservationStatus, int chambersInHeart, String eatingHabits, boolean bloodType, String furColor){
        super(name);//, species, conservationStatus, chambersInHeart, eatingHabits, bloodType);
        this.setChambersInHeart(4);
        this.setBloodType("Warm Blooded");
        //this.furColor = furColor;
    }

    public final String getFurColor() {
        return furColor;
    }

    public final void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public abstract void liveBirth();

    public abstract void sweat();

    public abstract void shedFur();
}
