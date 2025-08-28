abstract class Reptile extends Animal {
    public String scaleColor;
    private double eggSize;

    Reptile(String name) {//}, String species, String conservationStatus, int chambersInHeart, String eatingHabits, boolean bloodType, String scaleColor, double eggSize){
        super(name);//, species, conservationStatus, chambersInHeart, eatingHabits, bloodType);
        this.setChambersInHeart(3);
        this.setBloodType("Cold Blooded");
        //this.scaleColor = scaleColor;
        //this.eggSize = eggSize;
    }

    public final String getScaleColor() {
        return scaleColor;
    }

    public final void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public final double getEggSize() {
        return eggSize;
    }

    public final void setEggSize(double eggSize) {
        this.eggSize = eggSize;
    }

    public abstract void layEggs();

    public abstract void shedScales();

}
