import java.util.*;

public class HandOfStraightBetter{

    public static boolean findGroups(int arr[] , int group){
        int n = arr.length;

        if(n%group!=0) return false;
        
        Map<Integer , Integer> map = new TreeMap<>();

        for(int el : arr){
            map.put(el,map.getOrDefault(el, 0)+1);
        }

        while(!map.isEmpty()){
            int first = map.keySet().iterator().next();

            for(int i=0 ; i<group ; i++){
                int card = first + i;

                if(!map.containsKey(card)){
                    return false;
                }

                map.put(card, map.get(card)-1);
                if(map.get(card)==0){
                    map.remove(card);
                }
            }

        }

        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,2,3,4,7,8};
        int group = 3;

        System.out.println(findGroups(arr, group));

    }
}