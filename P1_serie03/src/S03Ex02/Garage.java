// Roman Schwob, 05-126-024

package S03Ex02;

import java.time.Year;

public class Garage {
    /**
     * Testklasse für die Klasse Car
     */

    public static void main(String[] args) {
        Car car1 = new Car("Porsche", "Carrera", 1956);
        Car car2 = new Car("VW", "Golf", 1979);
        Car car3 = new Car("Subaru", "Justy", 1980);
        printAllCars(car1, car2, car3);
        car1.setBrand("Ferrari");
        car2.setModel("Beetle");
        car3.setYear(1978);
        System.out.println("\nAFTER CHANGES: \n");
        printAllCars(car1, car2, car3);
        System.out.print(Year.now().getValue());
    }

    // Methode um alle Details der drei Autos zu printen
    private static void printAllCars(Car car1, Car car2, Car car3) {
        System.out.println("CAR1 ==========");
        System.out.println(car1);
        System.out.println("CAR2 ==========");
        System.out.println(car2);
        System.out.println("CAR3 ==========");
        System.out.println(car3);
        System.out.println("ANTIQUENESS ==========");
        System.out.println("Is car 1 antique? (" + car1.getYear() + ") " + 
                            car1.isAntique());
        System.out.println("Is car 2 antique? (" + car2.getYear() + ") " + 
                            car2.isAntique());
        System.out.println("Is car 3 antique? (" + car3.getYear() + ") " + 
                            car3.isAntique());
        System.out.println("GETTERS ==========");
        System.out.println("Car 1 Getters: " +
                            car1.getBrand() + " " +
                            car1.getModel() + " " +
                            car1.getYear());
        System.out.println("Car 2 Getters: " +
                            car2.getBrand() + " " +
                            car2.getModel() + " " +
                            car2.getYear());
        System.out.println("Car 3 Getters: " +
                            car3.getBrand() + " " +
                            car3.getModel() + " " +
                            car3.getYear());
    }

}
