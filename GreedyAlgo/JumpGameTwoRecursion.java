public class JumpGameTwoRecursion {

    public static int minJumps(int arr[] , int idx, int jump){
        if(idx>=arr.length-1) return jump;

        int mini = Integer.MAX_VALUE;
        for(int i=1 ; i<=arr[idx] ; i++){  
            mini=Math.min(mini, minJumps(arr, idx+i, jump+1));
        }

        return mini;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};
        System.out.println(minJumps(arr ,0 ,0));
    }
}
