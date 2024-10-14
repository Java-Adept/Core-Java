public class ExceptionalHandling  {

    public static void main(String arg[]) throws  NullPointerException{

        int a=10;
        int b=0;
        float res=0;
        try {
             throw new NullPointerException("This is nullpointer");
        }catch(NullPointerException e) {
        System.out.println("Exception");
        }finally {
            System.out.println("I am inside Finally");
        }
        System.out.println("Result : "+res);
    }
}
