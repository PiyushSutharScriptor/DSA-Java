public class FractionalKnapSackAlgoBetter {
    public static void main(String[] args) {
        int arr1[] = {100,60,100,200};
        int arr2[] = {20,10,50,50};
        int k = 90;

        int n = arr1.length;

        int min;
        for(int i=0 ; i<n ; i++){
            min = i;
            for(int j=i ; j<n ; j++){
                if(arr1[j]/arr2[j]>arr1[min]/arr2[min]){
                    min = j;
                }
            }
            int temp = arr1[i];
            arr1[i] = arr1[min];
            arr1[min] = temp;

            int temp2 = arr2[i];
            arr2[i] = arr2[min];
            arr2[min] = temp2;
        }

        int i=0;

        double count = 0;
        while(i<n){
            if(arr2[i]<=k){
                k-=arr2[i];
                count+=arr1[i];
            }
            else{
                count+=(arr1[i]*k)/arr2[i]; //dry run to form this formula
                break;
            }
            i++;
        }

        System.out.println(count);
        
    }
}
