package LivingBeings;

public class Zoo {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        // Note: we can instantiate a horse without isFlying and legs
        // because the constructor of the superclass "Mammal" has default values for isFlying
        // and "Horse" has a default value for legs
        animals[0] = new Horse("Mylady");
        // Note: we need to specify the isFlying value for a reptile, because it is direct subclass of "Animal"
        // and in the hierarchy, no default is set for isFlying
        // On the other hand, we do not need to specify the number of legs, because it is not a property of a reptile
        animals[1] = new Reptile("Reptix", false);
        animals[2] = new Bat("Batty");

        for(Animal a : animals){
            displayInfo(a);
        }

        System.out.println("Only mammals:");
        for(Animal a : animals){
            if(a instanceof Mammal){ // since we want to use the overloaded method specific for mammals, we filter for mammal objects
                System.out.println("Without overloaded method (treating as an animal): ");
                displayInfo(a); // Since above, the object is defined as an animal, it will be treated as an animal by default
                System.out.println("With overloaded method (treating as a mammal): ");
                displayInfo((Mammal) a); // NOTE: we are casting the object to Mammal, so that the overloaded method is called
            }
        }
    }

    private static void displayInfo(Animal a){
        System.out.println(a);
        a.eat();
        a.move();
        if(a instanceof Mammal){
            ((Mammal) a).giveBirth();
        }

    }
    private static void displayInfo(Mammal m){ // Define the same method, but for mammals; this is called method overloading
        System.out.println(m);
        System.out.println("This is a mammal, and thus has fur!");
        m.eat();
        m.move();
        m.giveBirth();
    }

}
