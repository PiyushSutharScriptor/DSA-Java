import java.util.*;

class Jump{
    int[] energy;
    int n;

    Jump(int size, int[] arr){
        this.n = size;
        this.energy = new int[n];

        Arrays.fill(energy,-1);
        energy[0] = 0;
        energy[1] = Math.abs(arr[1]-arr[0]);
    }

    public int findMin(int[] arr, int n){
        if(energy[n]!=-1) return energy[n];
        
        int left = findMin(arr, n-1) + Math.abs(arr[n]-arr[n-1]);
        int right = findMin(arr, n-2) + Math.abs(arr[n]-arr[n-2]);
        energy[n] = Math.min(left,right);
        return energy[n];
    }
}

public class FrogJumpMemoization {
    public static void main(String[] args) {
        int[] arr = {5,2,1,4};
        int n = arr.length;

        Jump j1 = new Jump(n, arr);
        int res = j1.findMin(arr, n-1);

        System.out.println(res);
    }
}

