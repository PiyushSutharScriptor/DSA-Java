import java.util.*;

public class FindSingleNumberBrute {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<arr.length ; i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}
