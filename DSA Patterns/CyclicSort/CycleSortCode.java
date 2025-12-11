public class CycleSortCode {      
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };

        int n = arr.length;
        int i = 0;

        while (i < n) {
            int correct = arr[i]-1;
            
            if(arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }

        for(int el : arr){
            System.out.println(el + " ");
        }
    }
}
