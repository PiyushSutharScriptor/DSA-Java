import java.util.*;

public class PrintKeysInHashMap {
    public static void main(String[] args) {
        Map<String , Integer>  map1 = new HashMap<>();
        map1.put("Umesh",1);
        map1.put("Piyush",2);
        map1.put("Aman",3);
        map1.put("Harsh",3);
        map1.put("Sarthak",1);

        for(String el : map1.keySet()){
            System.out.print(el + " ");
        }
    }
}
