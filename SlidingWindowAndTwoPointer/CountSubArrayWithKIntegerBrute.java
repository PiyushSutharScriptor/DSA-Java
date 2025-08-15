import java.util.*;

public class CountSubArrayWithKIntegerBrute {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,4};
        int k = 2;

        Map<Integer , Integer> map = new HashMap<>();
        int n = arr.length;
        int count = 0;

        for(int i=0 ; i<n ; i++){
            map.clear();
            for(int j=i ; j<n ; j++){
                map.put(arr[j],map.getOrDefault(arr[j], 0)+1);

                if(map.size()==k){
                    count++;
                }
                else if(map.size()>k){
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
