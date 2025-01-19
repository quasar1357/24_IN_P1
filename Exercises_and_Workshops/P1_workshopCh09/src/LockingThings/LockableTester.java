package LockingThings;
public class LockableTester {

    public static void main(String[] args) {
        Lockable[] lockables = new Lockable[3]; // Polymorph array !
        lockables[0] = new Safe("Safe1");
        lockables[1] = new Door("Door1", true);
        lockables[2] = new Door("Mysterious Door", false);

        for (Lockable lockable : lockables) { // Polymorph iteration !
            System.out.println(lockable); // type only defined at runtime...
            lockable.lock();
            System.out.println(lockable);
            lockable.unlock();
            System.out.println(lockable);
        }

        System.out.println("\nOpening all lockables:");
        lockables[2].lock(); // lock the mysterious door to see if we can open it
        openAll(lockables);
        for (Lockable lockable : lockables) {
            System.out.println(lockable);
        }
    }


    public static void openAll(Lockable[] lockables){
        for (Lockable lockable : lockables) {
            if (lockable.isAccessible()) {
                lockable.unlock();
            }
        }
    }
}