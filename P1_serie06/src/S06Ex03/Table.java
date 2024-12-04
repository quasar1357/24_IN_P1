public class Table extends Furniture {
    private double area;
    // NOTE: material, pricePerHour and workedHours are not necessary here, since they are inherited from the superclass Furniture

    public Table(Material material, double pricePerHour, double workedHours, double area){
        super(material, pricePerHour, workedHours); // Instantiate a Furniture with the given properties
        this.area = area; // Add the additional info of the area to the Table object
    }

    public double totalPrice(){
        double effortPrice = this.calculateEffort();
        double totalMaterialCost = this.area * this.material.materialCost; // Note: usually we would use the getter method, but since UML defines materialCost as public, let's also use it
        return effortPrice + totalMaterialCost;
    }
}
