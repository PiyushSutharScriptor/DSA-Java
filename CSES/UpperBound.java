import java.util.*;

public class UpperBound {

    public static int upperBound(int[] arr, int x){
        Arrays.sort(arr);

        int n = arr.length;
        int l = 0;
        int r = n-1;
        int ans = n;

        while(l<=r){
            int mid = l+(r-l)/2;

            if(arr[mid]>x){
                ans = mid;
                r = mid-1;
            }
            else l=mid+1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int x = 3;

        int res = upperBound(arr,x);
        System.out.println(res);

    }
}
