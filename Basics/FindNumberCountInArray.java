import java.util.Scanner;
public class FindNumberCountInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();


        int [] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            System.out.print("Enter Element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to find : ");
        int num = sc.nextInt();
        
        int count = 0;
        for(int i=0 ; i<n ; i++){
            if(arr[i]==num){
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
