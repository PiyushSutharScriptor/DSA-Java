import java.util.*;

public class FruitsIntoBasketBetter {
    public static void main(String[] args) {
        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};

        int n = fruits.length;
        Map<Integer , Integer> map = new HashMap<>();

        for(int i=0 ; i<n ; i++){
            map.put(fruits[i], map.getOrDefault(fruits[i], 0)+1);
        }

        int first = 0;
        int second = 0;

        for(int val : map.values()){
            if(val>first){
                first = second;
                second = val;
            }
            else if(val>first){
                first = val;
            }
        }

        System.out.println(map);
        System.out.println(first+second);
    }
}
