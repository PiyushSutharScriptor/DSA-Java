public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int n = height.length;
        int l = 0;
        int r = n-1;
        int lmax = 0;
        int rmax = 0;
        int count = 0;

        while(l<r){
            if(height[l]<=height[r]){
                if(lmax>height[l]){
                    count+=lmax-height[l];
                }
                else{
                    lmax = height[l];
                }
                l++;
            }
            else{
                if(rmax>height[r]){
                    count+=rmax-height[r];
                }
                else{
                    rmax = height[r];
                }
                r--;
            }
        }

        System.out.println(count);

    }
}
