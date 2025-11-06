import java.util.*;

public class AssignCookies {
    public static void main(String[] args) {
        int[] child = {1,2,3};
        int[] parent = {1,1};

        Arrays.sort(parent);
        Arrays.sort(child);

        int m = child.length;
        int n = parent.length;

        int i=0;
        int j=0;

        int count = 0;
        while(i<m && j<n){
            if(parent[j]>=child[i]){
                count++;
                i++;
                j++;
            }
            else j++;
        }

        System.out.println(count);
    }
}