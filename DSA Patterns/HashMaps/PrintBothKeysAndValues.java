import java.util.*;

public class PrintBothKeysAndValues {
    public static void main(String[] args) {
        Map<String , Integer>  map1 = new HashMap<>();
        map1.put("Umesh",1);
        map1.put("Piyush",2);
        map1.put("Aman",3);
        map1.put("Harsh",3);
        map1.put("Sarthak",1);

        //method 1 (moderate)
        for(Map.Entry<String,Integer> entry : map1.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();

        //method 2 (java 8+, lambda function)
        map1.forEach((key,value)->{
            System.out.println(key + " " + value);
        });

    }
}
