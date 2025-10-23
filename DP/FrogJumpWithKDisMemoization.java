import java.util.*;

class Jump{
    int[] energy;
    int n;

    Jump(int size, int[] arr){
        this.n = size;
        this.energy = new int[n];

        Arrays.fill(energy,-1);
        energy[0] = 0;

        if(n>1){
            energy[1] = Math.abs(arr[1]-arr[0]);
        }
    }

    public int findMin(int[] arr, int n, int k){
        if(energy[n]!=-1) return energy[n];
        
        int count = Integer.MAX_VALUE;
        for(int i=1 ; i<=k ; i++){   
            if(n-i>=0){
                int jum = findMin(arr, n-i,k) + Math.abs(arr[n]-arr[n-i]);
                count = Math.min(count,jum);
            }
        }
        energy[n] = count;
        return energy[n];
    }

}

public class FrogJumpWithKDisMemoization {
    public static void main(String[] args) {
        int[] arr = {15, 4, 1, 14, 15};
        int k = 3;
        int n = arr.length;

        Jump j1 = new Jump(n, arr);
        int res = j1.findMin(arr, n-1, k);

        System.out.println(res);
    }
}

