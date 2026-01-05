import java.util.*;

public class SingleNumber2UsingMap {
    
    public static int findEl(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0 ;i<arr.length; i++){
            map.put(arr[i] , map.getOrDefault(arr[i],0)+1);
        }

        //map traversal (Option-1)
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1) return entry.getKey();
        }   

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,8,5,7,4,1,2,8,5,99,7,4,1,2,8,5,7,4};

        int res = findEl(arr);
        System.out.println(res);
    }
}
