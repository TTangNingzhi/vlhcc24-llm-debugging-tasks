abstract class Bird extends Animal {
    private String feathersColor;
    private String beakShape;
    private double eggSize;
    private boolean canFly;

    Bird(String name) {
        super(name);
        this.setChambersInHeart(4);
        this.setBloodType("Warm Blooded");
    }

    public final String getFeathersColor() {
        return feathersColor;
    }

    public final void setFeatherColor(String feathersColor) {
        this.feathersColor = feathersColor;
    }

    public final String getBeakShape() {
        return beakShape;
    }

    public final void setBeakShape(String beakShape) {
        this.beakShape = beakShape;
    }

    public final double getEggSize() {
        return eggSize;
    }

    public final void setEggSize(double eggSize) {
        this.eggSize = eggSize;
    }

    public abstract void featherMolting();

    public abstract void layEggs();

    public abstract void changeFeatherColor();

    public abstract void fly();
}
