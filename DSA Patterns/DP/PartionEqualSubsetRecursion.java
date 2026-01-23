public class PartionEqualSubsetRecursion{

    public static boolean findValid(int idx, int sum, int[]arr){

        if(sum==0) return true;

        if(idx<0 || sum<0) return false;

        //not take || take
        return 
        findValid(idx-1, sum, arr) || 
        findValid(idx-1, sum-arr[idx], arr);
    }

    public static void main(String[] args) {
        int[] arr = {1,5,11,5};

        int sum = 0;
        for(int el : arr){
            sum+=el;
        }

        int n = arr.length;
        if(sum%2==0){
            System.out.println(findValid(n-1,sum/2,arr));
        }
        else{
            System.out.println(false);
        }
    }
}