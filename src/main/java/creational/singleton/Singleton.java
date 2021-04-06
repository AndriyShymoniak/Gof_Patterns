package creational.singleton;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    return new Singleton();
                }
            }
        }
        return singleton;
    }

    /*
    Any singleton logic is written below
     */
    public void singletonMethod() {
        System.out.println("Singleton is working");
    }
}
