public class HouseRobber2TabulationOptimized {

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
        int[] arr = {1, 5, 2, 1, 6};
        int n = arr.length;
        
        
        int[] temp1 = new int[n];
        int[] temp2 = new int[n];

        for(int i=0 ; i<n ; i++){
            if(i!=0) temp1[i] = arr[i];
            if(i!=n-1) temp2[i] = arr[i];
        }

        int res1 = findMax(temp1, n-1);
        int res2 = findMax(temp2, n-1);

        System.out.println(Math.max(res1,res2));
    }
}




