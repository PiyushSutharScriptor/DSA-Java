import java.util.*;

public class SmallestRangeInKlistsBrute {

    public static boolean findOne (int[][] arr , int k){
        return false;   
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,2,3},{1,2,3}};

        int m = arr.length;
        List<int[]> li = new ArrayList<>();

        for(int i=0 ; i<m ; i++){
            for(int j=1 ; j<arr[i].length ; j++){
                if(i==j) continue;
                else{
                    int[] a = {arr[i][0],arr[i][j]};
                    li.add(a);
                }
            }
        }

        for(int[] ar : li){
            System.out.println(ar[0] + " " + ar[1]);
        }

    }    
}
