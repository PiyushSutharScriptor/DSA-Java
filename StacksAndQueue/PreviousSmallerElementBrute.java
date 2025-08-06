public class PreviousSmallerElementBrute{
    public static void main(String[] args) {
        int arr[] = {4,5,2,10,8};

        int n = arr.length;

        for(int i=0 ; i<n ; i++){
            boolean find = false;

            for(int j=i-1 ; j>=0 ; j--){
                if(arr[j]<arr[i]){
                    arr[i] = arr[j];
                    find = true;
                    break;
                }
            }

            if(!find) arr[i]=-1;
        }

        for(int e : arr){
            System.out.println(e);
        }
    }
}