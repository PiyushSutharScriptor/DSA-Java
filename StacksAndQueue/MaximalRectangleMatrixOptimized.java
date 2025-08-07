import java.util.Stack;

public class MaximalRectangleMatrixOptimized {
    public static int passArray(int arr[]){
        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                int idx = st.pop();
                int wid = st.isEmpty() ? i : i - st.peek() - 1;
                maxi = Math.max(arr[idx] * wid, maxi);
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            int idx = st.pop();
            int wid = st.isEmpty() ? n : n - st.peek() - 1;
            maxi = Math.max(arr[idx] * wid, maxi);
        }

        return maxi; 
    }
    public static void main(String[] args) {
        int arr[][] = {{1,0,1,0,1},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};

        int m = arr.length;
        int n = arr[0].length;

        for(int i=0 ; i<n ; i++){
            int count = 1;
            for(int j=0 ; j<m ; j++){
                if(arr[j][i]!=1) count=1;
                else{
                    arr[j][i]=count;
                    count++;
                }
            }
        }

        int res = Integer.MIN_VALUE;
        for(int i=0 ; i<m ; i++){
            res = Math.max(res,passArray(arr[i]));
        }

        System.out.println(res);
    }
}
