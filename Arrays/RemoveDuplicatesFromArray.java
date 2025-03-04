import java.util.Scanner;
import java.util.ArrayList;

public class RemoveDuplicatesFromArray {

    public static ArrayList<Integer> removeDuplicates(int arr[] , int n){
        ArrayList <Integer> li = new ArrayList<>();

        if (n==0){
            return li;
        }

        li.add(arr[0]);

        for(int i=1 ; i<n ; i++){
            if(arr[i]!=arr[i-1]){
                li.add(arr[i]);
            }
        }

        return li;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        ArrayList <Integer> uniqueList = removeDuplicates(arr,n);
        System.out.println("Unique Array : " + uniqueList);

        sc.close();

    }
}
