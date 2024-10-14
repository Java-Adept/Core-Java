package Test;

public class SingletonClassExample {
	
	public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Check if both instances are the same
        System.out.println(instance1 == instance2);  // Output: true
    }
		
}

 class Singleton {
    // Private constructor to prevent instantiation
    private Singleton() {}

    // Inner static helper class responsible for holding the Singleton instance
    private static class SingletonHelper {
        // The instance is created when the class is loaded
        private static final Singleton INSTANCE = new Singleton();
    }

    // Global point of access to the Singleton instance
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
