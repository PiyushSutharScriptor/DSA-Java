import java.util.*;

public class KClosestPointToOrigin {

    public static int[][] findFreq(int[][] points, int k){

        Arrays.sort(points , (a,b)-> Integer.compare(a[0],b[0]));

        int[][] res = new int[k][2];
        int i=0;

        while(i<k){
            res[i][0] = points[i][0];
            res[i][1] = points[i][1];
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3},{-2,2},{-2,4}};
        int k = 2;
        
        int[][] res = findFreq(arr, k);

        for(int i=0 ; i<k ; i++){
            for(int j=0 ; j<2 ; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
