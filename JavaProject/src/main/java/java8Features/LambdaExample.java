package java8Features;

import java.util.ArrayList;

public class LambdaExample {

    public static void main(String arg[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(23);
        list.add(30);
        list.add(40);
        list.add(50);

        list.forEach((n) -> {
            if (n % 2 == 0) System.out.println(n);
        });

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello !");
        list2.add("Good Evening!!");
        // list2.forEach( (s) ->System.out.println(s));

        list2.forEach(System.out::println);


        list2.forEach(LambdaExample::display);

    }

    static void display(String s) {
        System.out.println(s);
    }

}


