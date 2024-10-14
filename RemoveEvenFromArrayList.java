import java.util.ArrayList;
import java.util.Scanner;
public class RemoveEvenFromArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number Of Elements : ");
        int n = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
            System.out.print("Enter element at "+(i+1)+" : ");
            int element = input.nextInt();
            list.add(element);
        }

        System.out.println("Input Array List Elements : ");
        System.out.println(list);
        
        for(int i = list.size()-1 ; i>=0; i--){
            if(list.get(i)%2==0){
                list.remove(i);
            }
        }

        System.out.println("After Removing Even Elements from ArrayList : ");
        System.out.println(list);

        input.close();
    }
}
