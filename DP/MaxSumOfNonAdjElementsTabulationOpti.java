public class MaxSumOfNonAdjElementsTabulationOpti {

    public static int findMax(int[] arr,int idx){
        int n = arr.length;

        //edge case : 
        if(n==1) return arr[0];

        int prev2 = arr[0];
        int prev1 = Math.max(arr[0], arr[1]);

        for(int i=2 ; i<n ; i++){
            int pick = arr[i] + prev2;
            int notPick = 0 + prev1;

            int current = Math.max(pick, notPick);
            prev2 = prev1;
            prev1 = current;

        }

        return prev1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 9};
        int n = arr.length;
        
        int res = findMax(arr, n-1);
        System.out.println(res);
    }
}




