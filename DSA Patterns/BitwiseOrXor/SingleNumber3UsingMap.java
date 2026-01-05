
import java.util.*;

public class SingleNumber3UsingMap {
    
    public static int[] findEl(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0 ;i<arr.length; i++){
            map.put(arr[i] , map.getOrDefault(arr[i],0)+1);
        }

        int[] res = new int[2];
        int i=0;
        //map traversal (Option-1)
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1) res[i++] = entry.getKey();
        }   

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,8,5,7,1,2,8,5,7,99,100};

        int[] res = findEl(arr);
        System.out.println(res[0] + " " + res[1]);
    }
}
