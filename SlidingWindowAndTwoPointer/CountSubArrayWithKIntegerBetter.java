import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithKIntegerBetter {

    public static int countSubArray(int arr[] , int k){
        if(k==0) return 0;

        Map<Integer , Integer> map = new HashMap<>();
        int n = arr.length;
        int count = 0;

        int l=0;
        for(int r=0 ; r<n ; r++){
            map.put(arr[r],map.getOrDefault(arr[r], 0)+1);

            while(map.size()>k){
                map.put(arr[l],map.get(arr[l])-1);
                
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                
                l++;
            }

            count+=(r-l+1);

        }

        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,4};
        int k = 2;

        System.out.println(countSubArray(arr, k)-countSubArray(arr, k-1));
    }
}
