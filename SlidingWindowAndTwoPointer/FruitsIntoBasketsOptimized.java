import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBasketsOptimized {
    public static void main(String[] args) {
        int arr[] = {3,3,3,1,2,1,1,1,2,3,3,4};
        int k=2;

        int n = arr.length;

        Map<Integer,Integer> map = new HashMap<>();

        int l = 0;
        int count=0;
        for(int r=0 ; r<n ; r++){
            map.put(arr[r],map.getOrDefault(arr[r], 0)+1);
            
            if(map.size()<=k){
                count = Math.max(count,r-l+1);
            }
            else{
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0) {
                    map.remove(arr[l]);
                }
                l++;
            }

        }

        System.out.println(count);
    }
}
