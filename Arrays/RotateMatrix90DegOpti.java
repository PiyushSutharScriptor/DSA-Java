public class RotateMatrix90DegOpti {
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
        
        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<n ; j++){
                if(i!=j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        /*
        for(int i=0 ; i<n-1 ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(i!=j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        */

        for(int k=0 ; k<n ; k++){
            int i=0;
            int j=n-1;
            while(i<j){
                int temp = arr[k][i];
                arr[k][i] = arr[k][j];
                arr[k][j] = temp;

                i++;
                j--;
            }
        }

        print(arr);
    }
}
