package LivingBeings;

public abstract class Animal {

    protected String name; // protected -> accessible in the same package and in subclasses
    protected boolean isFlying;

    public Animal(String name, boolean isFlying){
        this.name = name;
        this.isFlying = isFlying;
    }

    // Abstract methods -> must be implemented in subclasses; define the behavior of the animal
    public abstract void eat();
    public abstract void move();

    // toString
    public String toString(){
        return "Animal with name " + this.name + " | " + (this.isFlying ? "is flying" : "is not flying");
    }
    // Getters and Setters
    public String getName(){
        return this.name;
    }
    public boolean getIsFlying(){
        return this.isFlying;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setIsFlying(boolean isFlying){
        this.isFlying = isFlying;
    }

}
