public class PartionEqualSubsetBrute{

    public static boolean findValid(int idx, int l, int r, int[]arr){

        if(l==r) return true;
        if(idx<0) return false;

        //not take || take
        return 
        findValid(idx-1, l, r, arr) || 
        findValid(idx-1, l-arr[idx], r+arr[idx], arr);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};

        int sum = 0;
        for(int el : arr){
            sum+=el;
        }

        int n = arr.length;
        if(sum%2==0){
            System.out.println(findValid(n-1,sum,0,arr));
        }
        else{
            System.out.println(false);
        }
    }
}