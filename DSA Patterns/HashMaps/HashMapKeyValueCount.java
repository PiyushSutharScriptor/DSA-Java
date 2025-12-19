import java.util.*;

public class HashMapKeyValueCount {
    public static void main(String[] args) {

        int[] arr = {1,1,4,4,2,2,2,5,6,7,7,7,8,7,7};

        Map<Integer,Integer> map1 = new HashMap<>();

        for(int el : arr){
            map1.put(el, map1.getOrDefault(el,0)+1);
        }

        System.out.println(map1);
    }  
}
