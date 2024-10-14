public class Child  extends Parent{

    Child() {
        super();
        System.out.println("Child Constructor");
    }

    public void test() {
        System.out.println("I am inside child class");
    }

    public static void main(String arg[]) {
        Parent p1 =new Parent();
        p1.test();
        Child p2 =new Child();
        p2.test();
    }

}
