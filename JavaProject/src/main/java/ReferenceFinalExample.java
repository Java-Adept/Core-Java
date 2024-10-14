public class ReferenceFinalExample {

    public static void main(String arg[]) {
        //Final reference variable
        final StringBuilder sb=new StringBuilder("Hello ,");
        System.out.println(sb);
        sb.append("Welcome");

        System.out.println(sb);
    }
}
