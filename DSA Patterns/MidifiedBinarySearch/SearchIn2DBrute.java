public class SearchIn2DBrute {

    public static boolean findEl(int[][] arr , int t){

        int m = arr.length;
        int n = arr[0].length;

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(arr[i][j]==t){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;

        System.out.println(findEl(arr,target));
    }
}
