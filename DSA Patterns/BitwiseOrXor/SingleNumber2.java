import java.util.*;
public class SingleNumber2 {

    public static int findEl(int[] arr){
        int n = arr.length;

        int i=0;
        while(i<n){
            if(i<n-2 && arr[i]!=arr[i+2]){
                return arr[i];
            }
            else if(i==n-1) return arr[i];

            i+=3;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,2};

        Arrays.sort(arr);
        int res = findEl(arr);
        System.out.println(res);
    }    
}
