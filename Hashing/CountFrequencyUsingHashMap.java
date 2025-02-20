import java.util.Scanner;
import java.util.HashMap;
public class CountFrequencyUsingHashMap{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int [n];
        for(int i=0 ; i<n ; i++){
            System.out.print("Enter element of index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to find frequency : ");
        int a = sc.nextInt();
        
        HashMap <Integer , Integer> map = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i])+1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }

        System.out.println("Frequency of number " + a + " : " + map.get(a));

        sc.close();
        
    }
}