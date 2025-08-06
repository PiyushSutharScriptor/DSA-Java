public class NextSamllerElementBrute {
    public static void main(String[] args) {
        int arr[] = {5,7,9,6,7,4,5,1,37};
        int n = arr.length;

        for(int i=0 ; i<n ; i++){
            boolean find = false;

            for(int j=i+1 ; j<n ; j++){
                if(arr[j]<arr[i]){
                    arr[i] = arr[j];
                    find = true;
                    break;
                }
            }

            if(!find) arr[i]=-1;
        }

        for(int e : arr){
            System.out.print(e + " ");
        }

    }
}
