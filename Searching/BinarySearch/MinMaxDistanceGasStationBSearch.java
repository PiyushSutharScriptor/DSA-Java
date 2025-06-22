public class MinMaxDistanceGasStationBSearch
{
    public static void main(String[] args) {
        int arr[] = {1, 13, 17, 23};
        int n = arr.length;
        int k = 5;
        
        double low = 0, high = arr[n - 1] - arr[0];
        double eps = 1e-6;  
        
        while (high - low > eps) {
            double mid = (low + high) / 2;
            
            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                int diff = arr[i + 1] - arr[i];
                count += (int)(diff / mid);  
            }
            
            if (count > k) {
                low = mid;
            } else {
                high = mid;
            }
        }
        
        System.out.printf("%.6f\n", high);  
    }
}
