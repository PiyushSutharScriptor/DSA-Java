import java.util.*;

public class AestroidCollisionsBetterStack
{
	public static void main(String[] args) {
	    int arr[] = {-2,-1,1,2};
	    
	    int n = arr.length;
	    Stack<Integer> st = new Stack<>();
	    
	    for(int i=0 ; i<n ; i++){
	            if(arr[i]>0) st.push(arr[i]);
	            else{
    	            while(!st.isEmpty() && st.peek()<-arr[i] && st.peek()>0){
    	                st.pop();
    	            }
    	            if(st.isEmpty()){
    	                st.push(arr[i]);
    	            }
    	            else if(st.peek()==-arr[i]) st.pop();
    	            else st.push(arr[i]);
	            }
	    }
	    
	    System.out.println(st);
	    
	}
}