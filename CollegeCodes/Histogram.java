import java.util.Stack;

class Pair{
    int val;
    int idx;

    Pair(int val1,int idx1){
        this.val = val1;
        this.idx = idx1;
    }
}
public class Histogram{

    public static int[] nse(int[] arr){
        int n = arr.length;
	    
	    int[] a = new int[n];
	    Stack<Pair> st = new Stack<>();
	    
	    for(int i=n-1 ; i>=0 ; i--){
	        while(!st.isEmpty() && st.peek().val>=arr[i]){
	            st.pop();
	        }
	        if(st.isEmpty()){
	            a[i] = n-1;
	        }
	        else a[i] = st.peek().idx;
	        
	        st.push(new Pair(arr[i],i));
	    }

        return a;
    }

    public static int[] pse(int[] arr){
        int n = arr.length;
	    
	    int[] a = new int[n];
	    Stack<Pair> st = new Stack<>();
	    
	    for(int i=0 ; i<n ; i++){
	        while(!st.isEmpty() && st.peek().val>=arr[i]){
	            st.pop();
	        }
	        if(st.isEmpty()){
	            a[i] = 0;
	        }
	        else a[i] = st.peek().idx;
	        
	        st.push(new Pair(arr[i],i));
	    }

        return a;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        int n = arr.length;

        int[] nseArr = nse(arr);
        int[] pseArr = pse(arr);

        for(int el : nseArr){
            System.out.print(el + " ");
        }
        System.out.println();
        for(int el : pseArr){
            System.out.print(el + " ");
        }
        int total = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            total = Math.max(total, (nseArr[i]-pseArr[i]-1)*arr[i]);
        }
        
        System.out.println();

        System.out.println(total);
    }
}
