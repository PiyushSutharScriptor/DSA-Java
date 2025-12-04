import java.util.*;

public class FruitsIntoBasketCorrectOpt {
    public static void main(String[] args) {
        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};

        int n = fruits.length;
        Map<Integer , Integer> map = new HashMap<>();

        int l = 0;

        int maxi = 0;
        for(int r=0 ; r<n ; r++){
            map.put(fruits[r] , map.getOrDefault(fruits[r],0)+1);

            while(map.size()>2){
                map.put(fruits[l], map.get(fruits[l])-1);
                if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                }
                l++;
            }

            maxi = Math.max(maxi, r-l+1);
        }

        System.out.println(maxi);
             
    }       
}
