import java.util.*;

public class NumberOfOverLappingInterval {
    public static void main(String[] args) {
        int arr[][] = {{1,2},{1,2},{1,2}};

        int m = arr.length;

        Arrays.sort(arr, (p1,p2)-> Integer.compare(p1[1],p2[1]));

        int count = 0;
        int prev = arr[0][1];
        for(int i=1 ; i<m ; i++){
            if(arr[i][0]<prev){
                count++;
            }
            else{
                prev = arr[i][1];
            }
        }

        System.out.println(count);
    }
}
