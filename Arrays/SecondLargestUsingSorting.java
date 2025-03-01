import java.util.Scanner;

public class SecondLargestUsingSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("Enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        for(int i=0 ; i<n ; i++){
            int min = i;
            for(int j=0 ; j<n ; j++){
                if(arr[min]<arr[j]){
                    min = j;
                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        int temp = arr[n-1];

        for(int i=n-2 ; i>=0 ; i--){
            if(arr[i]<temp){
                temp = arr[i];
                break;
            }
        }
            
        System.out.print("The second largest number : " + temp);
    }
}
