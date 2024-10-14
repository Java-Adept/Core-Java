// Java Program for Parameterized Constructor
 class ParameterizedConstructor {
        // data members of the class.
        String name;
        int id;
        ParameterizedConstructor(String name, int id)
        {
            this.name = name;
            this.id = id;
        }
    }
public class ParameterizedConstructorTest {
        public static void main(String[] args)
        {
            // This would invoke the parameterized constructor.
            ParameterizedConstructor ParameterizedConstructor1 = new ParameterizedConstructor("Avinash", 68);
            System.out.println("Name :" + ParameterizedConstructor1.name
                    + " and Id :" + ParameterizedConstructor1.id);
        }
    }


