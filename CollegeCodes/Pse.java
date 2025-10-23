import java.util.*;

public class Pse
{
	public static void main(String[] args) {
	    int[] arr = {2,5,4,1};
	    
	    int n = arr.length;
	    
	    int[] a = new int[n];
	    Stack<Integer> st = new Stack<>();
	    
	    for(int i=0 ; i<n ; i++){
	        while(!st.isEmpty() && st.peek()>=arr[i]){
	            st.pop();
	        }
	        if(st.isEmpty()){
	            a[i] = -1;
	        }
	        else a[i] = st.peek();
	        
	        st.push(arr[i]);
	    }
	    
	    for(int el : a){
	        System.out.print(el + " ");
	    }
	    
	}
}