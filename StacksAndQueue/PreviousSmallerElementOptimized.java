import java.util.*;

public class PreviousSmallerElementOptimized {
    public static void main(String[] args) {
        int arr[] = {5,7,9,6,7,4,5,1,37};
        int n = arr.length;

        Stack <Integer> st = new Stack<>();

        for(int i=0 ; i<n ; i++){
            while(!st.isEmpty() && st.peek()>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(arr[i]);
                arr[i] = -1;
            }
            else{
                int el = arr[i];
                arr[i] = st.peek();
                st.push(el);
            }
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
