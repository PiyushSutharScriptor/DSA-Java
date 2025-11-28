public class RotateMatrix90DegBrute{

    public static void print(int[][] arr){
        int n = arr.length;

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                System.err.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = arr.length;

        int[][] arr2 = new int[n][n];

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                arr2[j][n-i-1] = arr[i][j];
            }
        }

        print(arr);
        System.err.println();
        print(arr2);
    }
}