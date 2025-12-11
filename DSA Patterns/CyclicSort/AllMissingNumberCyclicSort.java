import java.util.*;

public class AllMissingNumberCyclicSort {

    public static List<Integer> findNum(int[] arr){
        int n = arr.length;

        int i=0;
        List<Integer> res = new ArrayList<>();

        while(i<n){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else i++;
        }

        for(int el=0 ; el<n ; el++){
            if(arr[el]!=el+1) res.add(el+1);
        }

        return res;
        
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        List<Integer> res = findNum(arr);
        System.out.println(res);
    }    
}
