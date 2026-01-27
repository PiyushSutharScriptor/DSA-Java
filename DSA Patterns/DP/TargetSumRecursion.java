public class TargetSumRecursion {

    public static int findTar(int idx, int t, int[] arr){
        if(idx==0){
            int cnt = 0;

            if(t+arr[idx]==0) cnt++;
            if(t-arr[idx]==0) cnt++;
            
            return cnt;
        }

        int add = findTar(idx-1, t+arr[idx], arr);
        int sub = findTar(idx-1, t-arr[idx], arr);

        return add+sub;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int target = 3;

        int n = arr.length;
        int res = findTar(n-1,target,arr);
        System.out.println(res);
    }
}
