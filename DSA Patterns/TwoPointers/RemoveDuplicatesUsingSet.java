import java.util.*;

public class RemoveDuplicatesUsingSet {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,2,3,3,4,4,4,4};

        Set<Integer> set = new HashSet<>();

        for(int i=0 ; i<arr.length ; i++){
            set.add(arr[i]);
        }

        System.out.println(set);
    }    
}
