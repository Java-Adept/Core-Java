
class Employee {
    int emp_id;
    String name;

    Employee(int emp_id, String name) {
        this.emp_id=emp_id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ArrayExample {

    public static void main(String args[]) {
        Employee[] arr = new Employee[5];

        arr[0]=new Employee(1, "Preeti");
        arr[1]=new Employee(2,"Kenneth");
        arr[2]=new Employee(3, "Haida");
        arr[3]=new Employee(4,"Mangal");
        arr[4]=new Employee(5, "Ruth");


        for(int i=0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(arr.length);
    }
}


//Enter a number 435478  ==> reverse number is  : 874534