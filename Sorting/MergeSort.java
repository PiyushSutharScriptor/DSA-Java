import java.util.Scanner;
import java.util.ArrayList;

public class MergeSort {

    public static void mergeSort(int arr[], int low, int high, int n) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid, n);
        mergeSort(arr, mid + 1, high, n);
        merge(arr, low, mid, high, n);
    }

    public static void merge(int arr[], int low, int mid, int high, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }

        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for(int i=low ; i<=high ; i++){
            arr[i] = temp.get(i-low);
        }
    }

    public static void main(String[] args) {
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
        int high = arr.length - 1;
        mergeSort(arr, low, high, n);

        System.out.println("Sorted Array");
        for(int num : arr){
            System.out.print(num + " ");
        }

        sc.close();
    }
}
