import java.util.*;

public class Nse
{
	public static void main(String[] args) {
	    int[] arr = {5,2,1,10};
	    
	    int n = arr.length;
	    
	    int[] a = new int[n];
	    Stack<Integer> st = new Stack<>();
	    
	    for(int i=n-1 ; i>=0 ; i--){
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