// Roman Schwob, 05-126-024

package S03Ex04;

public class Box {
    /**
     * Class that models a Box object
     */

    // Dimensions
    private int length, width, height;
    // Status
    private boolean full;
    // Potential Cargo object in the box
    private Cargo cargo;

    // Constructor WITH parameters
    public Box(int lengthIn, int widthIn, int heightIn){
        this.length = lengthIn;
        this.width = widthIn;
        this.height = heightIn;
        this.full = false;
    }
    
    // Constructor WITHOUT parameters (default dimensions = 1)
    public Box(){
        this.length = 1;
        this.width = 1;
        this.height = 1;
        this.full = false;
    }

    // Method to set dimensions
    public void setDims(int lIn, int wIn, int hIn) {
        this.length = lIn;
        this.width = wIn;
        this.height = hIn;
    }

    // Method to get capacity
    public int getCapacity() {
        return this.length * this.width * this.height;
    }

    // Method to get "full" status (optional)
    public boolean getFull() {
        return this.full;
    }

    // Method to add a cargo object to box
    public boolean addCargo(Cargo cargoIn) {
        if(!this.full &&
        cargoIn.getLength() <= this.length &&
        cargoIn.getWidth() <= this.width &&
        cargoIn.getHeight() <= this.height) {
            this.full = true;
            this.cargo = cargoIn;
            return true;
        }
        // If adding not successful, check why and print message
        // NOTE: No else needed, as method returns if adding is successful
        if (this.full)
            System.out.println("Box schon voll! Nichts zugefügt.");
        else
            System.out.println("Stückgut passt nicht in die Box. " + 
            "Nichts zugefügt.");
        return false;
    }

    // toString method
    public String toString() {
        return "Box\n" +
        "Länge, Breite, Höhe: " +
        this.length + ", " + this.width + ", " + this.height + "\n" +
        "Voll: " + this.full + "\n" +
        "Inhalt: " + this.cargo;
    }

}
