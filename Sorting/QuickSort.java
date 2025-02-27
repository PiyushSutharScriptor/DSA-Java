import java.util.Scanner;

public class QuickSort{
    
    public static void quickSort(int arr [], int low ,int high){
        if(low<high){
            int partitionIdx = partition(arr, low, high);
            quickSort(arr, low, partitionIdx-1);
            quickSort(arr,partitionIdx+1 , high);
        }
    }
    
    public static int partition(int arr[] , int low, int high){
        int pivot = arr[low];
        int i=low;
        int j=high;
        
        while(i<j){
            while(arr[i]<=pivot && i<high){
                i++;
            }
            while(arr[j]>pivot && j>low){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        
        return j;
        
    }
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("Enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }
        
        int low = 0;
        int high = n-1;
        quickSort(arr, low, high);
        
        System.out.println();

        System.out.println("Sorted Array : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}