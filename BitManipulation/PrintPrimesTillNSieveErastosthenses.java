public class PrintPrimesTillNSieveErastosthenses{
    public static void main(String[] args) {
        int n = 20;

        int[] arr = new int[n+1];

        for(int i=2 ; i<=n ; i++){
            arr[i] = 1;
        }

        for(int i=2 ; i<=n ; i++){
            if(arr[i]==1){
                for(int j=2*i ; j<=n ; j+=i){
                    arr[j] = 0;
                }
            }
        }

        for(int i=2 ; i<=n ; i++){
            if(arr[i]==1){
                System.out.print(i + " ");
            }
        }

    }
}