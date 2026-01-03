public class SearchIn2DBetter {

    public static boolean search(int idx, int[][] arr, int t){
        int low = 0;
        int high = arr[0].length-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[idx][mid]==t) return true;
            else if(arr[idx][mid]<t){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return false;
    }

    public static boolean findEl(int[][] arr , int t){

        int m = arr.length;
        int n = arr[0].length;

        int low = 0;
        int high = m-1;

        while(low<=high){
            if(t>=arr[low][0] && t<=arr[low][n-1]){
                return search(low,arr,t);
            }
            else if(arr[high][0]>=t && arr[high][n-1]<=t){
                return search(high,arr,t);
            }
            low++;
            high--;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 20;

        System.out.println(findEl(arr,target));
    }
}
