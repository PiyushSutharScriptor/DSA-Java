import java.util.*;

public class MaximumSumCombinationWithKBrute {
    public static void main(String[] args) {
        int arr1[] = {1,4,2,3};
        int arr2[] = {2,5,1,6,};
        int k = 4;

        int m = arr1.length;
        int n = arr2.length;
        
        List<Integer> li = new ArrayList<>();
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                li.add(arr1[i]+arr2[j]);
            }
        }
        
        Collections.sort(li);
        int res[] = new int[k];

        int i=0;
        while(i<k){
            res[i] = li.get(li.size()-i-1);
            i++;
        }

        for(int el : res){
            System.out.print(el + " ");
        }
    }
}
