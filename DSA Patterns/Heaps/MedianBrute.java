import java.util.*;

public class MedianBrute {
    public static void main(String[] args) {
        int[] arr = {2,5,1,9,4,7};

        int n = arr.length;
        Arrays.sort(arr);

        // odd no. of elements
        if(n%2!=0){
            System.out.println(arr[n/2]);
        }
        // even no. of elements
        else{
            int res = (arr[n/2]+arr[(n-1)/2])/2;
            System.out.println(res);
        }
    }    
}
