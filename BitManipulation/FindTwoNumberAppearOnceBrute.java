import java.util.*;

public class FindTwoNumberAppearOnceBrute {
    public static void main(String[] args) {
        int[] arr = {2,4,2,6,3,7,7,3};

        int n = arr.length;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<n ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }

    }
}
