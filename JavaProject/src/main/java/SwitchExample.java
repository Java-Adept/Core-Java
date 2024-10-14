public class SwitchExample {

    int string;

    public static void main(String[] args) {
        char grade = 'H';
        switch (grade) {
            case 'A':
            case 'B' :
                System.out.println("Very Good");

            case 'C':
                System.out.println("Average");

            case 'D' :
                System.out.println("Low");
            default: System.out.println("Fail");

        }
    }
}
