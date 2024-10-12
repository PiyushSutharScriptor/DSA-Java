import java.util.Scanner;
public class MaximumOfArrayElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number Of Elements : ");
        int n = input.nextInt();

        int a[] = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("Enter element " + (i+1) + " : ");
            a[i] = input.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        for(int i=0 ; i<n ; i++){
            if(a[i]>max){
                max=a[i];
                maxIndex = i;   
            }
        }        
        System.out.println("Maximum Element is " + max + " at Index " + maxIndex);

        input.close();
    }
}
