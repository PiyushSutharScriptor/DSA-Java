public class CherryPickUp2Recursion{

    public static int findMax(int i, int j1, int j2, int[][]arr){
        int m = arr.length;
        int n = arr[0].length;

        if(j1<0 || j2<0 || j1>=n || j2>=n) return (int)-1e8;

        if(i==m-1){
            if(j1!=j2) return arr[i][j1]+arr[i][j2];
            else return arr[i][j1];
        }

        int maxi = (int)-1e8;

        for(int dj1=-1 ; dj1<=1 ; dj1++){
            for(int dj2=-1 ; dj2<=1 ; dj2++){
                if(j1!=j2){
                    maxi = Math.max(maxi, arr[i][j1]+arr[i][j2]+findMax(i+1, j1+dj1, j2+dj2,arr));
                }
                else{
                    maxi = Math.max(maxi,arr[i][j2]+findMax(i+1, j1+dj1, j2+dj2,arr));
                }
            }
        }

        return maxi;
    }
    
    public static void main(String[] args) {
        int[][] arr = {{2,3,1,2},{3,4,2,2},{5,6,3,5}};
        int n = arr[0].length;

        int res1 = findMax(0,0,n-1,arr);
        System.out.println(res1);
    }
}