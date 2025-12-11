import java.util.*;

public class AllMissingNumberUsingSet {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for(int el : nums){
            if(set.add(el));
        }

        List<Integer> li = new ArrayList<>();

        for(int i=1 ; i<=n ; i++){
            if(!set.contains(i)){
                li.add(i);
            }
        }

        System.out.println(li);
        
    }    
}
