import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {4,4,4,5,5,5,8,8,7,7,8,8,6,3,3};

        Set<Integer> set = new HashSet<>();
        for(int el : arr){
            set.add(el);
        }

        System.out.println(set);
    }
}
