import java.util.*;

public class PowerSetBetter {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        int n = arr.length;

        List<List<Integer>> res = new ArrayList<>();

        for(int num=0 ; num<(1<<n) ; num++){
            List<Integer> list = new ArrayList<>();
            for(int i=0 ; i<n ; i++){
                if((num & (1<<i))!=0){
                    list.add(arr[i]);
                }
            }
            res.add(list);
        }

        System.out.println(res);
    }
}
