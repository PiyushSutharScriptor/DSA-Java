import java.util.*;

public class NextSamllerElementOptimized {
    public static void main(String[] args) {
        int arr[] = {5,7,9,6,7,4,5,1,37};

        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for(int i=n-1 ; i>=0 ; i--){
            while(!st.isEmpty() && st.peek()>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(arr[i]);
                arr[i] = -1;
            }
            else{
                int num = arr[i];
                arr[i] = st.peek();
                st.push(num);
            }
        }

        for(int e : arr){
            System.out.print(e + " ");
        }

    }
}
