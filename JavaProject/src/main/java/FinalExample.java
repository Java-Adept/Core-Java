public class FinalExample {
    final static double PI;
    final String greet;

    {
        greet="Welcome";
    }

    static{
        PI=3.13;
    }

    public static void main(String arg[]) {


    System.out.println("Value of PI : "+PI);
        //System.out.println("Value of PI : "+greet);
    }
}
