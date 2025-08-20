import java.util.*;

public class ReplaceElementsByItsRankBrute {
    public static void main(String[] args) {
        int arr[] = {20 , 15 , 26 , 2 , 98 , 6};

        int n = arr.length;

        for(int i=0 ; i<n ; i++){
            Set<Integer> set = new HashSet<>();

            for(int j=0 ; j<n ; j++){
                if(arr[j]<arr[i]){
                    set.add(arr[j]);
                }
            }
            int rank = set.size()+1;
            System.out.print(rank + " ");
        }
    }
}
