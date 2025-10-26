import java.util.*;

public class NinjaTrainingMemoization {

    public static int meritPoints(int day, int last, int[][] task, int[][] arr){

        if(arr[day][last]!=-1) return arr[day][last];

        if(day==0){
            int maxi = 0;
            for(int i=0 ; i<=2 ; i++){
                if(i!=last) maxi = Math.max(maxi,task[0][i]);
            }

            return arr[day][last] = maxi;
        }

        int maxi = 0;
        for(int i=0 ; i<=2 ; i++){
            int point = 0;
            if(i!=last){
                point = task[day][i]+meritPoints(day-1, i, task, arr);
                maxi = Math.max(maxi,point);
            }
        }

        arr[day][last] = maxi;
        return arr[day][last];
    }
    public static void main(String[] args) {
        int[][] task = {{10, 40, 70},{20, 50, 80},{30, 60, 90}};
        int n = task.length;

        int[][] arr = new int[n][4];
        for(int[] el : arr){
            Arrays.fill(el,-1);
        }

        int res = meritPoints(n-1 , 3, task, arr);
        System.out.println(res);
    }
}
