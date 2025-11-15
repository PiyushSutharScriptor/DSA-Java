import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestDivisibleSubsetOptimized {
    public static List<Integer> findLDS(int[] arr) {

        int n = arr.length;
        Arrays.sort(arr);

        int[] dp = new int[n];    
        int[] hash = new int[n];  

        Arrays.fill(dp, 1);

        int maxi = 1;
        int lastIdx = 0;

        for (int idx = 0; idx < n; idx++) {

            hash[idx] = idx;

            for (int prev = 0; prev < idx; prev++) {

                if (arr[idx] % arr[prev] == 0) {  
                    if (dp[prev] + 1 > dp[idx]) {
                        dp[idx] = dp[prev] + 1;
                        hash[idx] = prev;
                    }
                }
            }

            if (dp[idx] > maxi) {
                maxi = dp[idx];
                lastIdx = idx;
            }
        }

        List<Integer> ans = new ArrayList<>();
        int curr = lastIdx;

        while (hash[curr] != curr) {
            ans.add(arr[curr]);
            curr = hash[curr];
        }
        ans.add(arr[curr]);

        Collections.reverse(ans);
        
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {16, 8, 2, 4, 32};
        List<Integer> res = findLDS(arr);
        System.out.println(res);
    }
}
