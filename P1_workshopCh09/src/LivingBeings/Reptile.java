package LivingBeings;

public class Reptile extends Animal { // note: as opposed to mammals, in this example reptiles are not abstract (we can have a reptile as an animal)

    public Reptile(String name, boolean isFlying) { // Here, we have to implement the constructor
        super(name, isFlying);
    }

    @Override
    public void eat() { // And we have to implement the abstract methods from the "Animal" superclass
        System.out.println("Reptile " + this.name + " is eating");
    }

    @Override
    public void move() { // 
        System.out.println("Reptile " + this.name + " is moving");
    }

}
