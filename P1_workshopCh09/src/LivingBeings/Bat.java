package LivingBeings;
public class Bat extends Mammal {

    public Bat(String name) {
        super(name, true, 2); // a bat is a mammal that is flying and has 2 legs (but we can choose the name)
    }

    @Override
    public void eat() { // specify how a bat eats; note that we have to implement the abstract method from the "Animal" superclass
        System.out.println("Bat " + this.name + " is eating");
    }

    @Override
    public void move() { // also an abstract method from the "Animal" superclass
        System.out.println("Bat " + this.name + " is moving");
    }

    @Override
    public void giveBirth() { // an abstract method from the "Mammal" superclass
        System.out.println("Bat " + this.name + " is giving birth");
    }

    public String toString() {
        return super.toString();
    }

}
