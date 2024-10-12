// Roman Schwob, 05-126-024

package S03Ex04;

public class Box {
    /**
     * Klasse für eine Box
     */

    // Dimensionen
    private int length, width, height;
    private boolean full;
    private Cargo cargo;

    // Konstruktor MIT Parameter
    public Box(int lengthIn, int widthIn, int heightIn){
        this.length = lengthIn;
        this.width = widthIn;
        this.height = heightIn;
        this.full = false;
    }
    
    // Konstruktor OHNE Parameter (Werte = 1)
    public Box(){
        this.length = 1;
        this.width = 1;
        this.height = 1;
        this.full = false;
    }

    // Methode, um die Dimensionen anzupassen
    public void setDims(int lIn, int wIn, int hIn) {
        this.length = lIn;
        this.width = wIn;
        this.height = hIn;
    }

    // Methode, um die Kapazität zu erhalten (optional)
    public int getCapacity() {
        return this.length * this.width + this.height;
    }

    // Methode, um Zustand voll/leer zu erhalten (optional)
    public boolean getFull() {
        return(this.full);
    }

    // Methode, um ein Stückgut zuzufügen
    public boolean addCargo(Cargo cargoIn) {
        if(!this.full &&
        cargoIn.getLength() <= this.length &&
        cargoIn.getWidth() <= this.width &&
        cargoIn.getHeight() <= this.height) {
            this.full = true;
            this.cargo = cargoIn;
            return(true);
        }
        // NOTE: Kein else nötig wegen return statement
        if (this.full) {
            System.out.println("Box schon voll! Nichts zugefügt.");
            return(false);
        } else {
            System.out.println("Stückgut passt nicht in die Box. " + 
            "Nichts zugefügt.");
            return(false);
        }
    }

    // toString Methode
    public String toString() {
        return("Box\n" +
        "Länge, Breite, Höhe: " +
        this.length + ", " + this.width + ", " + this.height + "\n" +
        "Voll: " + this.full + "\n" +
        this.cargo);
    }

}
