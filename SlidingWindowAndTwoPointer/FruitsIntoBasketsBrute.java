import java.util.*;

public class FruitsIntoBasketsBrute {
    public static void main(String[] args) {
        int arr[] = {3,3,3,1,2,1,1,1,2,3,3,4};
        int k=2;

        int n = arr.length;

        Set<Integer> set = new HashSet<>();

        int count=0;
        for(int i=0 ; i<n ; i++){
            int len=0;
            set.clear();
            for(int j=i ; j<n ; j++){
                set.add(arr[j]);
                if(set.size()<=k){
                    len++;
                }
                else break;
            }

            count = Math.max(len,count);
        }
        
        System.out.println(count);

    }
}
