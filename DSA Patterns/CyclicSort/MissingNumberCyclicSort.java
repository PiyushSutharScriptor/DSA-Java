
public class MissingNumberCyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,0,1};

        int n = arr.length;
        int i = 0;

        while(i<n){
            int correct = arr[i];
            if(arr[i]<n && arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else i++;
        }

        for(int el=0 ; el<n ; el++){
            if(arr[el]!=el){
                System.out.println("Number : " + el);
                break;
            }
        }
        
    }    
}
