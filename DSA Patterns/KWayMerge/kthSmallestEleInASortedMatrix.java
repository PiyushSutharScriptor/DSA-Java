import java.util.*;

public class kthSmallestEleInASortedMatrix{
    public static void main(String[] args) {
        int[][] arr = {{1,2},{1,3}};
        int k = 2;
        
        List<Integer> li = new ArrayList<>();
        int n = arr.length;

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                li.add(arr[i][j]);
            }
        }

        Collections.sort(li);

        System.out.println(li.get(k-1));
    }
}