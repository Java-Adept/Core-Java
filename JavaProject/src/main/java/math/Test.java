package math;


import math.Add;

public class Test  extends Add {

    public static void main(String[] args) {
        Add a= new Add(20,30);
        a.num1=30;
        a.num2=40;
        a.display();
    }
}

