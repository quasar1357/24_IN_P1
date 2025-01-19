package LockingThings;
public class Door implements Lockable {

    private String name;
    private boolean locked, accessible;

    public Door(String name, boolean accessible){
        this.name = name;
        this.accessible = accessible;
        this.locked = false;
    }

    // WE HAVE TO IMPLEMENT THE ABSTRACT METHODS OF THE IMPLEMENTED INTERFACE
    @Override
    public void lock() {
        this.locked = true;
    }

    @Override
    public void unlock() {
        this.locked = false;
    }

    @Override
    public boolean isAccessible() {
        return this.accessible;
    }

    // WE CAN ALSO ADD ADDITIONAL METHODS
    public String toString(){
        return "Door with name " + this.name + " which is " +
        (this.locked ? "locked" : "unlocked") + " and " +
        (this.accessible ? "accessible" : "inaccessible");
    }
}
