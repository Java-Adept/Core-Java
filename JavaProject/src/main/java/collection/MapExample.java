package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String arg[]) {

        Map<Integer,String> map= new HashMap<>();
        map.put(1, "Preeti");
        map.put(2, "Mangal");
        map.put(3, "Hyda");

       System.out.println( map.get(2));


        for(Map.Entry  e :  map.entrySet()) {
        System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}
