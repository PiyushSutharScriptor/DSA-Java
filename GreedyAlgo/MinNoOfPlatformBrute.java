public class MinNoOfPlatformBrute {
    public static void main(String[] args) {
        int start[] = {900, 905, 915, 920};
        int end[] = {930, 920, 925, 940};

        int n = start.length;

        int maxi = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++){
            int count = 1;
            for(int j=0 ; j<n ; j++){
                if(i!=j && start[i]<end[j] && start[j]<end[i]){
                    count++;
                }
            }

            maxi = Math.max(maxi, count);
        }

        System.out.println(maxi);
    }
}
