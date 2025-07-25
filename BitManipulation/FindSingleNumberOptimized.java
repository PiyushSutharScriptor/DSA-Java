public abstract class FindSingleNumberOptimized {
    public static void main(String[] args) {
        int arr[] = {1,2,4,4,2,3,1};
        int xor = 0;
        for(int i=0 ; i<arr.length ; i++){
            xor ^= arr[i];
        }

        System.out.println(xor);
    }
}
