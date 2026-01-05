import java.util.*;

public class DuplicateNumbersXOROpt{
    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        
        Set<Integer> set = new HashSet<>();
        int ans = 0;

        for(int i=0 ; i<arr.length ; i++){
            if(set.contains(arr[i])){
                ans^=arr[i];
            }
            set.add(arr[i]);
        }

        System.out.println(ans);
    }
}