import java.util.*;

public class ReplaceElementsByItsRankOptimized {
    public static void main(String[] args) {
        int arr[] = {20 , 15 , 26 , 2 , 98 , 6};

        int n = arr.length;

        int dum[] = new int[n];

        for(int i=0 ; i<n ; i++){
            dum[i] = arr[i];
        }

        Arrays.sort(dum);

        int temp = 1;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<n ; i++){
            if(map.get(dum[i])==null){
                map.put(dum[i],temp);
                temp++;
            }
        }

        for(int i=0 ; i<n ; i++){
            System.out.print(map.get(arr[i]) + " ");
        }
    }
}
