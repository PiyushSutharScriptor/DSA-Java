import java.util.*;

public class PrintPrimesTillNOptimized {
    public static void main(String[] args) {
        int n = 20;

        boolean[] arr = new boolean[n];
        Arrays.fill(arr,true);

        arr[0] = false;
        arr[1] = false;
        
        for(int i=2 ; i*i<n ; i++){
            if(arr[i]){
                for(int j=i*i ; j<n ; j+=i){
                    arr[j] = false;
                }
            }
        }

        for(int i=2 ; i<n ; i++){
            if(arr[i]){
                System.out.print(i + " ");
            }
        }
    }
}
