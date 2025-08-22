import java.util.*;

public class ConnectNRopesWithMinimalCostBrute {
    public static void main(String[] args) {
        int arr[] = {2,4,3};

        int n = arr.length;

        Arrays.sort(arr);

        int sum = arr[0];
        int res = 0;
        for(int i=1 ; i<n ; i++){
            sum+=arr[i];
            res+=sum;
        }

        System.out.println(res);
    }
}

// Note this is not accurate (use the min heap optimized for this solution)