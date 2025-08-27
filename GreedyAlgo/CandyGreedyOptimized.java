public class CandyGreedyOptimized {
    public static void main(String[] args) {
        int arr[] = {0,2,4,3,2,1,1,3,5,6,4,0,0};

        int n = arr.length;

        int sum = 1;
        int i=1;

        while(i<n){
            if(arr[i]==arr[i-1]){
                sum++;
                i++;
                continue;
            }
            int peak = 1;
            while(i<n && arr[i]>arr[i-1]){
                peak++;
                sum+=peak;
                i++;
            }
            int down = 1;
            while(i<n && arr[i]<arr[i-1]){
                sum+=down;
                down++;
                i++;
            }
            if(down>peak){
                sum+=down-peak;
            }
        }

        System.out.println(sum);
    }
}
