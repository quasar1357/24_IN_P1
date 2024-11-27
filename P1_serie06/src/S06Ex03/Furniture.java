public class Furniture {
    public Material material; // NOTE: We would usually not define public instance variables, but UML says so
    protected double pricePerHour, workedHours;

    public Furniture(Material material, double pricePerHour, double workedHours){
        this.material = material;
        this.pricePerHour = pricePerHour;
        this.workedHours = workedHours;
    }

    public double calculateEffort(){
        double price = this.pricePerHour * this.workedHours;
        return price;
    }


}
