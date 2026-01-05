public class DuplicateNumbersXOR{
    public static void main(String[] args) {
        int[] arr = {1,2,1,3};
        
        int ans = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if((ans^arr[i])==0){
                ans = arr[i];
                break;
            }
        }

        System.out.println(ans);
    }
}