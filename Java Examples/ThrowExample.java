// Java program that demonstrates
// the use of throw
class Test {
    public static void main(String[] args)
    {
        System.out.println(1 / 0);
    }
}

//********************************************************** */

// Java program that demonstrates the use of throw
class ThrowExample {
    static void fun()
    {
        try {
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }
 
    public static void main(String args[])
    {
        try {
            fun();
        }
        catch (NullPointerException e) {
            System.out.println("Caught in main.");
        }
    }
}