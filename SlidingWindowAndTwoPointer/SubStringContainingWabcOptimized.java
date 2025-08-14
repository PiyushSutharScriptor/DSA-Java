import java.util.*;

public class SubStringContainingWabcOptimized {
    public static void main(String[] args) {
        
        String s = "bbacba";

        int n = s.length();

        int count = 0;
        int arr[] = {-1,-1,-1};

        for(int r=0 ; r<n ; r++){
            arr[s.charAt(r)-'a'] = r;    

            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1){
                count = count+1+Math.min(arr[0],Math.min(arr[1],arr[2]));
            }
        }

        System.out.println(count);
    }
}
