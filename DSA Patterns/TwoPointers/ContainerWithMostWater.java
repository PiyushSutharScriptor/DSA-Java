import java.util.*;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        int n = height.length;
        int l = 0;
        int r = n-1;

        int maxi = 0;   
        while(l<r){
            int ht = Math.min(height[l],height[r]) * (r-l);
            maxi = Math.max(maxi,ht);

            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }

        System.out.println(maxi);

    }    
}
