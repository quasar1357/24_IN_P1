package LockingThings;
public interface Lockable {

    void lock();
    void unlock();
    boolean isAccessible();

}
