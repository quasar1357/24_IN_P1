package LockingThings;
import java.util.Scanner;

public class Safe implements Lockable {

    private String name, code;
    private boolean locked, accessible;

    public Safe(String name){
        this.name = name;
        this.accessible = true;
        this.locked = true;
    }

    // WE HAVE TO IMPLEMENT THE ABSTRACT METHODS OF THE IMPLEMENTED INTERFACE
    @Override
    public void lock() {
        this.locked = true;
        System.out.println("What's the code?");
        Scanner scanner = new Scanner(System.in);
        this.code = scanner.nextLine();
    }

    @Override
    public void unlock() {
        System.out.println("What's the code?");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().equals(this.code)){
            this.locked = false;
        }
    }

    @Override
    public boolean isAccessible() {
        return this.accessible;
    }

    // WE CAN ALSO ADD ADDITIONAL METHODS
    public String toString(){
        return "Safe with name " + this.name + " which is " +
        (this.locked ? "locked" : "unlocked") + " and " +
        (this.accessible ? "accessible" : "inaccessible | " + 
        "Code: " + this.code.length() + " characters");  
    }
}
