// Roman Schwob, 05-126-024

package S03Ex04;

public class Cargo {
    /**
     * Class that models a Cargo object
     */

    // Dimensions
    private int length, width, height;
    // Name
    private String name;

    // Constructor with parameters
    public Cargo(String nameIn, int lengthIn, int widthIn, int heightIn) {
        this.name = nameIn;
        this.length = lengthIn;
        this.width = widthIn;
        this.height = heightIn;
    }

    // Getter methods
    public String getName() {
        return this.name;
    }
    public int getLength() {
        return this.length;
    }
    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }

    // Setter methods
    public void setName(String nameIn) {
        this.name = nameIn;
    }
    public void setLength(int lengthIn) {
        if(lengthIn > 0){
            this.length = lengthIn;
        } else {
            System.out.println("Wert muss positiv sein. Nichts geändert.");
        }
    }
    public void setWidth(int widthIn) {
        if(widthIn > 0){
            this.width = widthIn;
        } else {
            System.out.println("Wert muss positiv sein. Nichts geändert.");
        }
    }
    public void setHeight(int heightIn) {
        if(heightIn > 0){
            this.height = heightIn;
        } else {
            System.out.println("Wert muss positiv sein. Nichts geändert.");
        }
    }

    // toString method
    public String toString() {
        return "Stückgut: \"" + this.name + "\"\n" +
               "Länge, Breite, Höhe: " +
               this.length + ", " + this.width + ", " + this.height;
    }
}
