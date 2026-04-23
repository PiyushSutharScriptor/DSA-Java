import java.util.*;

public class MajorityElementUsingMap {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};

        Map<Integer,Integer> map = new HashMap<>();

        for(int el : nums){
            map.put(el, map.getOrDefault(el,0)+1);
        }

        int res = 0;
        int t = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>t){
                res = entry.getKey();
                t = entry.getValue();
            }
        }

        System.out.println(res);

    }
}
