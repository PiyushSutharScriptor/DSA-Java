import java.util.*;

public class NextGreaterElementOptimized {
    public static void main(String[] args) {

      int arr[] = {4,12,5,3,1,2,5,3,1,2,4,6};
      int n = arr.length;
      
      Stack<Integer> st = new Stack<>();
      
      for(int i=n-1 ; i>=0 ; i--){
        if(st.isEmpty()){
          st.push(arr[i]);
          arr[i] = -1;
        }
        else{
          if(arr[i]<st.peek()){
            int a = arr[i];
            arr[i] = st.peek();
            st.push(a);
          }
          else{
            while(!st.isEmpty() && (st.peek()<arr[i] || st.peek()==arr[i]) ){
              st.pop();
            }
            if(st.isEmpty()){
              st.push(arr[i]);
              arr[i] = -1;
            }
            else{
              int a = arr[i];
              arr[i] = st.peek();
              st.push(a);
            }
          }
        }
      }
      
      for(int e : arr){
        System.out.print(e + " ");
      }
  }
}