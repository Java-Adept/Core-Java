package math;
 public class Add {
     int num1;
     int num2;

     public Add() {
     }

     public Add(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    protected void display() {
        System.out.println("Result : " + (num1+num2));
    }

}


