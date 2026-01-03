public class SearchIn2DPart2Opti {

    public static boolean findEle(int[][] arr, int t){
        int m = arr.length;
        int n = arr[0].length;

        int row = 0;
        int col = n-1;

        while(row<=m-1 && col>=0){
            if(arr[row][col]==t){
                return true;
            }
            else if(arr[row][col]<t){
                row++;
            }
            else{
                col--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 210;

        System.out.println(findEle(arr,target));
    }
}
