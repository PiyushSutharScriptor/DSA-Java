import java.util.*;

public class FrequencyUsingHashMap {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,5,5,4,8,7,8,5,65,8,74,5};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int el : arr){
            map.put(el, map.getOrDefault(el,0)+1);
        }

        System.out.println(map);
        System.out.println();

        System.out.println("Printing only keys : ");
        for(int el : map.keySet()){
            System.out.print(el + " ");
        }
        System.out.println();

        System.out.println("Printing only values : ");
        for(int el : map.values()){
            System.out.print(el + " ");
        }
        System.out.println();

        System.out.println("Printing keys and values using lambda functions");
        map.forEach((key,value)->{
            System.out.println(key + " : " + value);
        });
        System.out.println();

        System.out.println("Printing keys and values using default method");
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());    
        }
    }
}
