public class PreviousSmallerElementBrute{
    public static void main(String[] args) {
        int arr[] = {5,7,9,6,7,4,5,1,37};

        int n = arr.length;
        int res[] = new int[n];

        for(int i=0 ; i<n ; i++){
            boolean find = false;

            for(int j=i-1 ; j>=0 ; j--){
                if(arr[j]<arr[i]){
                    res[i] = arr[j];
                    find = true;
                    break;
                }
            }

            if(!find) res[i]=-1;
        }

        for(int e : res){
            System.out.print(e + " ");
        }
    }
}