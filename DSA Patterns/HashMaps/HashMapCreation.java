import java.util.*;

public class HashMapCreation {
    public static void main(String[] args) {
        Map<Integer , Integer>  map1 = new HashMap<>();
        map1.put(1,1);
        map1.put(2,1);
        map1.put(3,1);
        map1.put(4,1);
        map1.put(5,1);

        System.out.println(map1);


        Map<String , Integer>  map2 = new HashMap<>();
        map2.put("Umesh",1);
        map2.put("Piyush",2);
        map2.put("Aman",3);
        map2.put("Harsh",3);
        map2.put("Sarthak",1);

        System.out.println(map2);

    }
}
