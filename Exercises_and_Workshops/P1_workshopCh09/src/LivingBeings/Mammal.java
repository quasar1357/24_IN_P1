package LivingBeings;

public abstract class Mammal extends Animal {

    private int numberOfLegs; // mammals have a number of legs
    // Note that we do not have to define the variables name and isFlying, as they are already defined in the superclass; they can be used in this class

    public Mammal(String name, boolean isFlying, int numberOfLegs){ // Note that in this abstract class we technically do not have to implement a constructor
        super(name, isFlying); // call the constructor of the superclass (i.e. initialize a mammal as an animal)
        this.numberOfLegs = numberOfLegs; // add the information about the number of legs
    }

    public abstract void giveBirth(); // specify that all mammals give birth (but not specify what happens when they give birth)

    public int getNumberOfLegs(){
        return this.numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }

    public String toString(){
        return super.toString() + " | " + this.numberOfLegs + " legs";
    }

}
