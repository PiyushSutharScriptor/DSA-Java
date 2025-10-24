public class HouseRobber2Recursion {

    public static int findMax(int[] arr, int idx){
        if(idx==0) return arr[0];
        if(idx<0) return 0;

        int pick = arr[idx] + findMax(arr, idx-2);
        int notPick = 0 + findMax(arr, idx-1);

        return Math.max(pick,notPick);
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
