import java.util.*;

public class InputExample {

    public static void main(String args[]) {
        //To take input from the user
        Scanner scan=new Scanner(System.in);
    //Input for first number
        System.out.println("Enter a number : " ) ;
        int s1=scan.nextInt();
//Input second number
        System.out.println("Enter second number : " ) ;
        int s2=scan.nextInt();

        int result = s1+s2;

        System.out.println("Result  : " +result ) ;

    }

}
