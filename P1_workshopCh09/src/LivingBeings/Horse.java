package LivingBeings;

public class Horse extends Mammal{

    public Horse(String name){
        super(name, false, 4); // a horse is a mammal that is not flying and has 4 legs (but we can choose the name)
    }

    @Override
    public void eat() { // specify how a horse eats; note that we have to implement the abstract method from the "Animal" superclass
        System.out.println("Horse " + this.name + " is eating");
    }

    @Override
    public void move() { // also an abstract method from the "Animal" superclass
        System.out.println("Horse " + this.name + " is moving");
    }

    @Override
    public void giveBirth() { // an abstract method from the "Mammal" superclass
        System.out.println("Horse " + this.name + " is giving birth");
    }

    public String toString(){
        return super.toString();
    }
}
