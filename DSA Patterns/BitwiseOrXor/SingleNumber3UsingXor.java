import java.util.*;
public class SingleNumber3UsingXor {

    public static int[] findEl(int[] arr){
        
        Arrays.sort(arr);

        int res[] = new int[2];
        int n = arr.length;

        int k=0;
        int i=1;

        while(i<n){
            if((arr[i]^arr[i-1])==0){
                i+=2;
            }
            else{
                res[k++] = arr[i-1];
                i++;
            }
        }

        if(i==n) res[k]=arr[n-1];

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,8,5,7,1,2,8,5,7,99,100};

        int[] res = findEl(arr);
        System.out.println(res[0] + " " + res[1]);
    }
}
