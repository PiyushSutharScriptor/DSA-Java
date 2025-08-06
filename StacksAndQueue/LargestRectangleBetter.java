import java.util.Stack;

public class LargestRectangleBetter{

    public static int[] findNse(int arr[]){

        int n = arr.length;

        int res1[] = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i=n-1 ; i>=0 ; i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(i);
                res1[i] = n;
            }
            else{
                res1[i] = st.peek();
                st.push(i);
            }
        }

       return res1;
    }

    public static int[] findPse(int arr[]){

        int n = arr.length;
        int res2[] = new int[n];

        Stack <Integer> st = new Stack<>();

        for(int i=0 ; i<n ; i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                st.push(i);
                res2[i] = -1;
            }
            else{
                res2[i] = st.peek();
                st.push(i);
            }
        }

        return res2;
        
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        int n = arr.length;

        //we are using indexes not autal values 
        //the nse[] and pse[] stores the indexes of values not actual value
        int nse[] = findNse(arr);
        int pse[] = findPse(arr);
        int maxi = Integer.MIN_VALUE;

        for(int i=0 ; i<n; i++){
            maxi = Math.max((arr[i] * (nse[i]-pse[i]-1)) , maxi);
        }

        System.out.println(maxi);
    }
}
