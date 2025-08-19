import java.util.*;

public class KthLargestSubArraySumBrute {
    public static void main(String[] args) {
        int arr[] = {3 , -2 , 5};
        int k = 3;

        int n = arr.length;
        List<Integer> li = new ArrayList<>();

        //we can also use the arr 
        //count of subarray = n(n+1)/2; formula

        for(int i=0 ; i<n ; i++){
            int sum = 0;
            for(int j=i ; j<n ; j++){
                sum+=arr[j];
                li.add(sum);
            }
        }

        Collections.sort(li);
        
        System.out.println(li);

        System.out.println(li.get(li.size()-k));

    }
}
