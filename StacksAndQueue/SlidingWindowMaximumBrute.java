import java.util.*;

public class SlidingWindowMaximumBrute {
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,2,1,6};
        int k = 3;

        List<Integer> li = new ArrayList<>();

        int n = arr.length;

        for(int i=0 ; i<=n-k ; i++){
            int maxi = Integer.MIN_VALUE;
            for(int j=i ; j<i+k ; j++){
                maxi = Math.max(arr[j],maxi);
            }
            li.add(maxi);
        }

        System.out.println(li);
        
    }
}
