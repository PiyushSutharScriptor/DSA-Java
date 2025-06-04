import java.util.*;

class PrintMatrixSpiral {
    public static void main(String args[]) {

        int matrix[][] = {{1,2,3,4,5,6},{20,21,22,23,24,7},{19,32,33,34,25,8},{18,31,36,35,26,9},{17,30,29,28,27,10},{16,15,14,13,12,11}};

        List<Integer> result = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;  

        int left = 0;
        int right = m - 1;
        int bottom = n;
        int top = 0;

        int total = n * m; 
        int count = 0;

        while (count < total) {
            for (int i = left; i <= right && count < total; i++) {
                result.add(matrix[top][i]);
                count++;
            }
            top++;

            for (int i = top; i < bottom && count < total; i++) {
                result.add(matrix[i][right]);
                count++;
            }
            right--;

            for (int i = right; i >= left && count < total; i--) {
                result.add(matrix[bottom - 1][i]);
                count++;
            }
            bottom--;

            for (int i = bottom - 1; i >= top && count < total; i--) {
                result.add(matrix[i][left]);
                count++;
            }
            left++;
        }

        System.out.print(result);
    }
}
