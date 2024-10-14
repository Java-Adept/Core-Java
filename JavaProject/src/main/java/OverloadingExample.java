//Compile Time polymorphism
public class OverloadingExample {

    public int add(int x, int y) {
        return x+y;
    }

    public int add(int x, int y, int z) {
        return x+y+z;
    }

    public String add(String firstName, String lastName) {
        return  firstName+lastName;
    }

    public static void main(String arg[]) {

        OverloadingExample ol = new OverloadingExample();
        System.out.println(ol.add(20,40));
        System.out.println(ol.add(20,40, 50));
        System.out.println(ol.add("Preeti", " Yadav"));

    }

}
