public class ConstructorExample {

    int id;
    String name;


    ConstructorExample() {
        super();
        System.out.println("Constructor ");
    }



    ConstructorExample(int id, String name) {
        this.id=id;
        this.name=name;

    }

    void display() {
        System.out.println("Id : "+id);
        System.out.println("name : "+name);
    }

    public static void main(String arg[]) {
        ConstructorExample o=new ConstructorExample();
        o.display();

        ConstructorExample c=new ConstructorExample(1, "Preeti");
        c.display();
    }
}
