import java.util.*;

public class CountSubArrayWithSumKOptimized {
    public static void main(String[] args) {
        
        int arr[] = {1,0,1,0,1};
        int k = 2;

        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;

        map.put(0,1);
        for(int i=0 ; i<n ; i++){
            sum+=arr[i];
            int pre = sum-k;
            count+=map.getOrDefault(pre,0);
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }

        System.out.println(count);
    }
}
