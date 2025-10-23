    import java.util.*;

    public class MinSubarraySum
    {
        public static int[] nse(int[] arr){
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
            
            return a;
        }


        public static int[] pse(int[] arr){
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
            return a;
        }
        
        
        public static void main(String[] args) {
            int[] arr = {2,5,4,1};
            int n = arr.length;

            int[] a = nse(arr);
            int[] b = pse(arr);

            for(int el : a){
                System.out.print(el + " ");
            }

            System.out.println();

            for(int el : b){
                System.out.print(el + " ");
            }

            int total = 0;

            for(int i=0 ; i<n ; i++){
                int left = i-a[i];
                int right = b[i] - i;

                total += Math.abs(arr[i]*left*right);
            }

            System.out.println(total);
            
        }
    }