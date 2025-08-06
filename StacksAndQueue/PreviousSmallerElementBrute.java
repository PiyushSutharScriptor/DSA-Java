public class PreviousSmallerElementBrute{
    public static void main(String[] args) {
        int arr[] = {4,5,2,10,8};

        int n = arr.length;

        for(int i=0 ; i<n ; i++){
            for(int j=i-1 ; j>=0 ; j--){
                if(arr[j]<arr[i]){
                    arr[i] = arr[j];
                }
            }
        }

        for(int e : arr){
            System.out.println(e);
        }
    }
}