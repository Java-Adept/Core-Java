package fileHandling;

public class Student  implements  Comparable<Student>{

    int studentId;
    String name;

    double fees;

    public Student(int studentId, String name, double fees) {
        this.studentId = studentId;
        this.name = name;
        this.fees = fees;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return "Student Id : "+studentId + "\n"+"Student name : "+name;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public int compareTo(Student o) {
        if(fees ==o.fees) return 0;
        else if(fees < o.fees) return 1;
        else return -1;
    }
}
